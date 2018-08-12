package com.tigrex.microservice.provider.templateProvider.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.tigrex.api.constant.ContextConst;
import com.tigrex.microservice.provider.templateProvider.utils.DynamicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
public class DataSourcesConfig {

    @Bean(name = "employeeDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.employee")
    public DataSource employeeDataSource(){
        return new DruidDataSource();
    }

    @Bean(name = "memberDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.member")
    public DataSource memberDataSource(){
        return new DruidDataSource();
    }

    @Bean(name = "wechatDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.wechat")
    public DataSource wechatDataSource(){
        return new DruidDataSource();
    }

    /**
     * 初始化数据库链接池
     * 先以主数据库作为数据库链接
     * 如果数据库链接替换不关闭链接池，而是关闭之前的数据库链接，新建新的数据库链接
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        //配置默认数据源
        dynamicDataSource.setDefaultTargetDataSource(employeeDataSource());

        //配置多数据源
        HashMap<Object, Object> dataSourceMap = new HashMap();
        dataSourceMap.put(ContextConst.DataSourceType.EMPLOYEE.name(), employeeDataSource());
        dataSourceMap.put(ContextConst.DataSourceType.MEMEBER.name(), memberDataSource());
        dataSourceMap.put(ContextConst.DataSourceType.WECHAT.name(), wechatDataSource());
        dynamicDataSource.setTargetDataSources(dataSourceMap);
        return dynamicDataSource;
    }

    /**
     * 数据库文件扫描，数据库链接工厂
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dynamicDataSource());
        //此处设置为了解决找不到mapper文件的问题
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/*.xml"));
        return sqlSessionFactoryBean.getObject();
    }

    /**
     * 数据库sql运行模板
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }

    /**
     * 配置@Transactional注解事务
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }

}

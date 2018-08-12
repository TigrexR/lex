package com.tigrex.microservice.provider.templateProvider.service.impl;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.tigrex.api.constant.ContextConst;
import com.tigrex.api.constant.DataSource;
import com.tigrex.microservice.provider.templateProvider.domain.User;
import com.tigrex.microservice.provider.templateProvider.service.IUserService;
import org.springframework.stereotype.Service;

@Service
@DataSource(ContextConst.DataSourceType.MEMEBER)
public class UserService extends ServiceImpl<BaseMapper<User>, User> implements IUserService {

}

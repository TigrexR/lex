package com.tigrex.microservice.provider.templateProvider.domain;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "USER")
public class User{

    /**
     * 人员表主键
     */
    @TableId(value = "ID")
    private Integer id;

    /**
     * 人员名称
     */
    @TableField(value = "NAME")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "AGE")
    private Integer age;

}

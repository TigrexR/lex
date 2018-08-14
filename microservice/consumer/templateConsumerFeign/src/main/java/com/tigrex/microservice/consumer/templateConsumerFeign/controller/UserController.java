package com.tigrex.microservice.consumer.templateConsumerFeign.controller;

import com.tigrex.api.controller.templateProvider.UserClintController;
import com.tigrex.api.vo.templateProvider.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserClintController userClintController;

    /**
     * 通过人员id获取人员信息
     * @param userId
     * @return
     */
    @GetMapping(value = "/getUserInfoByUserId")
    public UserVo getUserInfoByUserId(Integer userId){
        UserVo userVo = new UserVo();
        userVo.setId(userId);
        return userClintController.getUserInfoByUserId(userVo);
    }

}

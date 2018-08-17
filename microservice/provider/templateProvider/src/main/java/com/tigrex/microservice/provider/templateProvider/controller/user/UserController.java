package com.tigrex.microservice.provider.templateProvider.controller.user;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tigrex.api.vo.templateProvider.UserVo;
import com.tigrex.microservice.provider.templateProvider.domain.User;
import com.tigrex.microservice.provider.templateProvider.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 人员
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * 人员service
     */
    @Autowired
    private IUserService userService;

    /**
     * 通过人员id获取人员信息
     * @param userVo
     * @return
     */
    @GetMapping(value = "/getUserInfoByUserId")
    @Transactional(readOnly = true)
    public UserVo getUserInfoByUserId(UserVo userVo){
        User user = new User();
        user.setId(userVo.getId());
        EntityWrapper<User> userEntityWrapper = new EntityWrapper<>(user);
        user = userService.selectOne(userEntityWrapper);
        userVo.setId(user.getId());
        return userVo;
    }

}

package com.tigrex.api.controller.templateProvider;

import com.tigrex.api.vo.templateProvider.UserVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "templateProvider")
@RequestMapping(value = "/user")
public interface UserClintController {

    @GetMapping(value = "/getUserInfoByUserId")
    public UserVo getUserInfoByUserId(UserVo userVo);

}

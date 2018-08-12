package com.tigrex.microservice.consumer.templateConsumer.controller;

import com.tigrex.api.vo.templateProvider.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private static final String REST_URL_PREFIX = "http://templateProvider";

    /**
     * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
     * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * 获取人员信息
     * @return
     */
    @GetMapping(value = "/getUserInfoByUserId")
    public UserVo getUserInfoByUserId(Integer userId){
        return restTemplate.getForObject(REST_URL_PREFIX + "/user/getUserInfoByUserId" + "?id=" + userId, UserVo.class);
    }

}

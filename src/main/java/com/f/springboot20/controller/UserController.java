package com.f.springboot20.controller;

import com.f.springboot20.bean.User;
import com.f.springboot20.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "用户信息接口")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser/{id}")
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "0", required = true)
    public User getUser(@PathVariable String id) {
        return userService.Sel(Integer.parseInt(id));
    }

    @GetMapping("/getNameById/{id}")
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "李四"),
            @ApiImplicitParam(name = "address", value = "用户地址", defaultValue = "深圳", required = true)
    }
    )
    public User getUserById(@PathVariable Integer id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    public User getNameById(@PathVariable String id) {
        return userService.getNameById(Integer.parseInt(id));
    }


}

package net.developerly.restfulapi.web.controller;

import net.developerly.restfulapi.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LY
 * @create 2017/10/30
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<User> query() {
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @GetMapping("/{id:\\d+}")
    public User getInfo(@PathVariable String id) {
        System.out.println("查询 id = "+ id +" 的用户信息");
        User user = new User();
        user.setId("1");
        user.setUsername("DeveloperLY");
        user.setPassword("123456");
        return user;
    }
}

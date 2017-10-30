package net.developerly.restfulapi.web.controller;

import net.developerly.restfulapi.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LY
 * @create 2017/10/30
 **/
@RestController
public class UserController {

    @GetMapping("/user")
    public List<User> query() {
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }
}

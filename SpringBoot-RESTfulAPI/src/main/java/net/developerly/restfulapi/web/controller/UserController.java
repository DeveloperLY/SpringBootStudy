package net.developerly.restfulapi.web.controller;

import net.developerly.restfulapi.dto.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LY
 * @create 2017/10/30
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping
    public User create(@RequestBody User user) {

        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getBirthday());

        user.setId("1");
        return user;
    }

    @PutMapping("/{id:\\d+}")
    public User update(@RequestBody User user) {

        System.out.println(user.getId());
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        System.out.println(user.getBirthday());

        return user;
    }

    @DeleteMapping("/{id:\\d+}")
    public void delete(@PathVariable String id) {
        System.out.println(id);
    }

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

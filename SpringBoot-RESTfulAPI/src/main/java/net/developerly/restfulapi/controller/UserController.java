package net.developerly.restfulapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LY
 * @create 2017/10/30
 **/
@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot";
    }
}

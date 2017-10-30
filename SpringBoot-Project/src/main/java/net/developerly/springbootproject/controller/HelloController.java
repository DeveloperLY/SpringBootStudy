package net.developerly.springbootproject.controller;

import net.developerly.springbootproject.properties.PeopleProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld
 *
 * @author LY
 * @create 2017/10/01
 **/
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private Integer age;

    @Value("${content}")
    private String content;

    @Autowired
    private PeopleProperties peopleProperties;

    @RequestMapping(value = {"/hello", "/hi"}, method = RequestMethod.GET)
    public String say() {
        return "Hello Spring Boot !";
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String myInfo(@RequestParam("age") Integer age) {
        return "My Name is" + name + ", I am " + age + " years old.";
    }

    @RequestMapping(value = "/content", method = RequestMethod.POST)
    public String content() {
        return content;
    }

    @RequestMapping(value = "/people")
    public String peopleProperties() {
        return peopleProperties.getName();
    }
}

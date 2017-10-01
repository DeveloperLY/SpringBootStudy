package net.developerly.springbootproject;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * People配置文件
 *
 * @author LY
 * @create 2017/10/01
 **/
@Component
@ConfigurationProperties(prefix = "people")
public class PeopleProperties {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

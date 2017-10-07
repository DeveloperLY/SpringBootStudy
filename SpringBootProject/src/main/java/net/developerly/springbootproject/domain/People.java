package net.developerly.springbootproject.domain;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * @author LY
 * @create 2017/10/01
 **/
@Entity
public class People {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @Min(value = 18, message = "未成年人禁止注册")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

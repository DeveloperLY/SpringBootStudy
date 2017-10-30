package net.developerly.restfulapi.dto;

import java.util.Date;

/**
 * @author LY
 * @create 2017/10/30
 **/
public class User {
    private String id;

    private String username;

    private String password;

    private Date brithday;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}

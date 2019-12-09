package cn.sawyer.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @program: mystarter
 * @description:
 * @author: sawyer
 * @create: 2019-12-09 15:01
 **/
@ConfigurationProperties("my.config")
public class MyProperties {
    private String name;

    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package cn.sawyer.starter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * @program: mystarter
 * @description:
 * @author: sawyer
 * @create: 2019-12-09 14:51
 **/
public class MyRunner implements CommandLineRunner {
    @Autowired
    MyProperties properties;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("name = " + properties.getName());
        System.out.println("email = " + properties.getEmail());
        System.out.println("I am running...");
    }
}

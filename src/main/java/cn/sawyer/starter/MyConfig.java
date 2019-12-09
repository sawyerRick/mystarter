package cn.sawyer.starter;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: mystarter
 * @description:
 * @author: sawyer
 * @create: 2019-12-09 14:50
 **/
@Configuration
@EnableConfigurationProperties(MyProperties.class)
public class MyConfig {

    @Bean
    public MyRunner myRunner() {
        return new MyRunner();
    }
}

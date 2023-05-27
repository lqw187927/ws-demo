package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author luqiwei
 * @Date 2023/5/11 11:24
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        new SpringApplication(Application.class).run(args);
    }
}

package org.tutorial.skywalking.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <p>description : HelloWorldApplication
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/2 1:05 AM
 */
@SpringBootApplication
@EntityScan(basePackages = "org.tutorial.skywalking.helloworld.entity")
@EnableJpaRepositories(basePackages = "org.tutorial.skywalking.helloworld.repository")
public class HelloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

}

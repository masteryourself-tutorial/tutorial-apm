package org.masteryourself.tutorial.skywalking.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * <p>description : DemoApplication
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/2 1:05 AM
 */
@SpringBootApplication
@EntityScan(basePackages = "org.masteryourself.tutorial.skywalking.demo.entity")
@EnableJpaRepositories(basePackages = "org.masteryourself.tutorial.skywalking.demo.repository")
public class DemoApplication {

    /**
     * 启动时需要配置 agent 参数
     * -javaagent:/Users/ruanrenzhao/environment/apache-skywalking-apm-bin/agent/skywalking-agent.jar
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

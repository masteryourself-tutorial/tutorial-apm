package org.masteryourself.tutorial.skywalking.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * <p>description : Student
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/2 1:09 AM
 */
@Entity
@Table(name = "student")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}

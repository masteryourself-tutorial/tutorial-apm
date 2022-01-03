package org.masteryourself.tutorial.skywalking.demo.controller;

import org.masteryourself.tutorial.skywalking.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.masteryourself.tutorial.skywalking.demo.entity.Student;

import javax.annotation.Resource;

/**
 * <p>description : StudentController
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/2 1:07 AM
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping("/find/{id}")
    public Student find(@PathVariable("id") Long id){
        return studentService.find(id);
    }

    @GetMapping("/save/{name}")
    public Student save(@PathVariable("name") String name){
        return studentService.save(name);
    }

}

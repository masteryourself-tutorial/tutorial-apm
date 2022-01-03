package org.masteryourself.tutorial.skywalking.demo.service;

import org.masteryourself.tutorial.skywalking.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.masteryourself.tutorial.skywalking.demo.entity.Student;

import javax.annotation.Resource;

/**
 * <p>description : StudentService
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/2 1:08 AM
 */
@Service
public class StudentService {

    @Resource
    private StudentRepository studentRepository;

    public Student find(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student save(String name) {
        Student student = new Student();
        student.setName(name);
        return studentRepository.save(student);
    }
}

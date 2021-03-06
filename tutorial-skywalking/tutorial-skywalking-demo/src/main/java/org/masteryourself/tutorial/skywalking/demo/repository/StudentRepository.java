package org.masteryourself.tutorial.skywalking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.masteryourself.tutorial.skywalking.demo.entity.Student;

/**
 * <p>description : StudentRepository
 *
 * <p>blog : https://www.yuque.com/ruanrenzhao/
 *
 * @author : masteryourself
 * @version : 1.0.0
 * @date : 2022/1/2 1:09 AM
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}

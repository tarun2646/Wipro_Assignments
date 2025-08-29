package com.wipro.tarun.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.tarun.entities.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {

    // You can add custom methods if needed, for example:
    Teacher findByTeacherName(String teachername);
}
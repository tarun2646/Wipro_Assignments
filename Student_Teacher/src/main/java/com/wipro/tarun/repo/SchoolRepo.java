package com.wipro.tarun.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.tarun.entities.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Long> {

    List<School> findBySchoolName(String schoolName);

    List<School> findByTeacher_TeacherName(String teacherName); 

}

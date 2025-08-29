package com.wipro.tarun.service;

import com.wipro.tarun.entities.*;
import java.util.List;

public interface SchoolService {
    School save(School school);
    List<School> findAll();
    School findById(Long id);
    School update(Long id, School school);
   
    
    void delete(Long id);
	List<School> findBySchoolName(String name);
	List<School> findBySchoolAddress(String address);
	School patchUpdate(Long id, String name);
}

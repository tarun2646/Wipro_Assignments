package com.wipro.tarun.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.tarun.entities.School;
import com.wipro.tarun.service.SchoolService;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    private SchoolService schoolService;

    @PostMapping("/saveSchool")	
    public School saveSchool(@RequestBody School school) {
        return schoolService.save(school);
    }

    @GetMapping
    public List<School> getAll() {
        return schoolService.findAll();
    }

    @GetMapping("/getSchoolById/{id}")
    public School getSchoolById(@PathVariable Long id) {
        return schoolService.findById(id);
    }

    @PutMapping("/updateSchoolById/{id}")
    public School updateSchoolById(@PathVariable Long id, @RequestBody School school) {
        return schoolService.update(id, school);
    }

    @PatchMapping("/patchUpdateSchoolById/{id}")
    public School patchUpdateSchoolById(@PathVariable Long id, @RequestParam String name) {
        return schoolService.patchUpdate(id, name);
    }

    @DeleteMapping("/deleteSchoolById/{id}")
    public String deleteSchoolById(@PathVariable Long id) {
        schoolService.delete(id);
        return "Deleted Successfully";
    }

    // Custom JPQL
    @GetMapping("/by-name/{name}")
    public List<School> getByName(@PathVariable String name) {
        return schoolService.findBySchoolName(name);
    }

    // Native Query
    @GetMapping("/by-address/{address}")
    public List<School> getByAddress(@PathVariable String address) {
        return schoolService.findBySchoolAddress(address);
    }
}

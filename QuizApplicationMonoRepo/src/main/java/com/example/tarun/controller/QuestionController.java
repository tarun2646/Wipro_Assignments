package com.example.tarun.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tarun.entities.Question;
import com.example.tarun.service.QuestionService;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("/api/v1")
public class QuestionController {


	private final QuestionService service;

	@PostMapping("/addQuestion")
	public Question addQuestion( @RequestBody Question question) {
		System.out.println(" entered end point");
		return service.saveQuestion(question);
	}

	@GetMapping("/getQuestionById/{id}")
	public Question getQuestion(@PathVariable Long id) {
		return service.getQuestion(id);
	}

	@GetMapping("/getAllQuestions")
	public Page<Question> findAllQuestion(Pageable pg) {
		return service.findAllQuestions(pg);
	}

	@DeleteMapping("/deleteQuestion/{id}")
	public void deleteQuestion(Long id) {
		 service.deleteQuestion(id);
	}

	@PatchMapping("/patchQuestion/{id}")
	public Question patchQuestion(@PathVariable Long id, @RequestBody Question q) {
		return service.patchQuestionById(id, q);
	}
	

	
   



}
	
	


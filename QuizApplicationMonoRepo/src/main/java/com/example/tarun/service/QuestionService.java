package com.example.tarun.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import com.example.tarun.entities.Question;

public interface QuestionService {

	Question saveQuestion(Question q);
	Question getQuestion(Long id);
	Page<Question> findAllQuestions(Pageable pg);
	void deleteQuestion(Long id);
	Question patchQuestionById(Long id, Question q);
	
	
	
}



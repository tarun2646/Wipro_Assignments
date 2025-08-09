package com.example.tarun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;


import com.example.tarun.entities.Category;
import com.example.tarun.entities.DifficultyLevel;
import com.example.tarun.entities.Question;
import com.example.tarun.repository.QuestionRepository;



@SpringBootApplication
public class QuizApplication implements ApplicationRunner{

	@Autowired
	private QuestionRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Question q = new Question(1, "which country introduced the Java langauge","india", "usa", "japan", "china","india", DifficultyLevel.EASY, Category.JAVA);
		repo.save(q);
	}
	
	
}


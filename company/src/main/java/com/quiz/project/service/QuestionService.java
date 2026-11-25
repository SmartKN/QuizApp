package com.quiz.project.service;

import com.quiz.project.entity.Question;
import com.quiz.project.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    public List<Question> getallquestions() {
        return questionRepository.findAll();
    }

    public List<Question> getResultsByCategory(String category) {
        return questionRepository.findBycategory(category);
    }

    public String addquestion(Question question) {
        questionRepository.save(question);
        return "success";
    }
}

package com.quiz.project.controller;

import com.quiz.project.entity.Question;
import com.quiz.project.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allquestions")
    public List<Question> getAllQuestions() {
        return questionService.getallquestions();
    }

    @GetMapping("category/{category}")
    public List<Question> getResultsByCategory(@PathVariable String category) {
        return questionService.getResultsByCategory(category);
    }

    //RequestBody --> converts json to java object
    @PostMapping("add")
    public String addquestion(@RequestBody Question question) {
        return questionService.addquestion(question);
    }
}
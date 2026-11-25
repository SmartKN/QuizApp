package com.quiz.project.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 100)
    private String category;

    @Column(name = "difficulty_level", length = 50)
    private String difficultyLevel;

    @Column(name = "question_title", nullable = false, length = 500)
    private String questionTitle;

    @Column(nullable = false, length = 255)
    private String option1;

    @Column(nullable = false, length = 255)
    private String option2;

    @Column(nullable = false, length = 255)
    private String option3;

    @Column(nullable = false, length = 255)
    private String option4;

    @Column(name = "right_answer", nullable = false, length = 255)
    private String rightAnswer;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;
}

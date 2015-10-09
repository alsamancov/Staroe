package com.springapp.mvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "answer_id")
    private int id;

    @Column(name = "text_answer")
    private String textAnswer;

    @Column(name = "correct")
    private boolean correct;

    @Column(name = "question_id")
    private int questionId;

    public Answer() {
    }

    public Answer(String textAnswer, boolean correct, int questionId) {
        this.textAnswer = textAnswer;
        this.correct = correct;
        this.questionId = questionId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextAnswer() {
        return textAnswer;
    }

    public void setTextAnswer(String textAnswer) {
        this.textAnswer = textAnswer;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
}

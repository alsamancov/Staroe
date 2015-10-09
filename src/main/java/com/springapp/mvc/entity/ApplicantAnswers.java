package com.springapp.mvc.entity;

import javax.persistence.*;

@Entity
@Table(name = "applicant_answers")
public class ApplicantAnswers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "applicantAnswers_id")
    private int id;

    @Column(name = "question_id")
    private int questionId;

    @Column(name = "applicant_id")
    private int applicantId;

    public ApplicantAnswers() {
    }

    public ApplicantAnswers(int questionId, int applicantId) {
        this.questionId = questionId;
        this.applicantId = applicantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }
}

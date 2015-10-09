package com.springapp.mvc.repository;


import com.springapp.mvc.entity.ApplicantAnswers;

import java.util.List;

public interface ApplicantAnswersDao {
    public void insert(ApplicantAnswers applicantAnswers);
    public void delete(int id);
    public ApplicantAnswers findApplicantAnswersById(int id);
    public void updateApplicantAnswers(ApplicantAnswers applicantAnswers);
    public List<ApplicantAnswers> getAllApplicantAnswers();
    //public ApplicantAnswers findApplicantAnswersBy
}

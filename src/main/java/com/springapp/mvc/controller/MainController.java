package com.springapp.mvc.controller;


import com.springapp.mvc.entity.Answer;
import com.springapp.mvc.entity.Applicant;
import com.springapp.mvc.entity.Question;
import com.springapp.mvc.service.AnswerService;
import com.springapp.mvc.service.ApplicantService;
import com.springapp.mvc.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private ApplicantService applicantService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerService answerService;

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

    @RequestMapping(value="/insertapplicant", method = RequestMethod.GET)
    public String insertApplicant() {
        applicantService.insert(new Applicant("John", "Smith", "jsmith@ukr.net", "jsmith451", 10));
        return "hello";
    }

    @RequestMapping(value="/insertquestion", method = RequestMethod.GET)
    public String insertQuestion(){
        questionService.insert(new Question("Which one of the following is NOT a correct variable name?", 1));
        return"hello";
    }

    @RequestMapping(value = "/insertanswer", method = RequestMethod.GET)
    public String insertAnswer(){
        answerService.insert(new Answer("boolean value = 12;", false, 2));
        return "hello";
    }

}
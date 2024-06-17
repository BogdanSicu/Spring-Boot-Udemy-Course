package com.munte.section8_rest_api.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController()
@RequestMapping("/surveys")
public class SurveyController {

    private final SurveyService surveyService;

    @Autowired
    public SurveyController(SurveyService surveyService) {
        this.surveyService = surveyService;
    }

    @GetMapping()
    public List<Survey> retrieveAllSurveys() {
        return surveyService.retrieveAllSurveys();
    }

    @GetMapping("/{id}")
    public Survey retrieveSurveyById(@PathVariable(name = "id") String searchedId) {

        Survey survey = surveyService.retrieveSurveyById(searchedId);

        if(survey == null) {
            throw new ResponseStatusException((HttpStatus.NOT_FOUND));
        }

        return survey;
    }


}

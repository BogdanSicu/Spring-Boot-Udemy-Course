package com.munte.section8_rest_api.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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

    @GetMapping("/{id}/questions")
    public List<Question> retrieveAllSurveyQuestions(@PathVariable(name = "id") String searchedId) {

        List<Question> questions = surveyService.retrieveAllSurveyQuestions(searchedId);

        if(questions == null) {
            throw new ResponseStatusException((HttpStatus.NOT_FOUND));
        }

        return questions;
    }

    @GetMapping("/{surveyId}/questions/{questionId}")
    public Question retrieveSpecificSurveyQuestion(@PathVariable(name = "surveyId") String surveyId, @PathVariable(name = "questionId") String questionId) {

        Question question = surveyService.retrieveSpecificSurveyQuestion(surveyId, questionId);

        if(question == null) {
            throw new ResponseStatusException((HttpStatus.NOT_FOUND));
        }

        return question;
    }

    @PostMapping("/{surveyId}/questions/")
    public ResponseEntity<Object> addNewSurveyQuestion(@PathVariable(name = "surveyId") String surveyId, @RequestBody Question question) {
        String questionId = surveyService.addNewSurveyQuestion(surveyId, question);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("{questionId}").buildAndExpand(questionId).toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/{surveyId}/questions/{questionId}")
    public ResponseEntity<Object> deleteSurveyQuestion(@PathVariable(name = "surveyId") String surveyId, @PathVariable(name = "questionId") String questionId) {
        String checkIfDeleted = surveyService.deleteSurveyQuestion(surveyId, questionId);

        if(checkIfDeleted == null) {
            throw new ResponseStatusException((HttpStatus.NOT_FOUND));
        }

        return ResponseEntity.noContent().build();
    }

}

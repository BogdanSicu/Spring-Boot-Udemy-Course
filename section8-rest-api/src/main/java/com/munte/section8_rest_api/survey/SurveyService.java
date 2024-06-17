package com.munte.section8_rest_api.survey;

import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    private static List<Survey> surveys = new ArrayList<>();

    static {
        Question question1 = new Question("Question1",
                "Most Popular Cloud Platform Today", Arrays.asList(
                "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "AWS");
        Question question2 = new Question("Question2",
                "Fastest Growing Cloud Platform", Arrays.asList(
                "AWS", "Azure", "Google Cloud", "Oracle Cloud"), "Google Cloud");
        Question question3 = new Question("Question3",
                "Most Popular DevOps Tool", Arrays.asList(
                "Kubernetes", "Docker", "Terraform", "Azure DevOps"), "Kubernetes");

        List<Question> questions = new ArrayList<>(Arrays.asList(question1,
                question2, question3));

        Survey survey = new Survey("Survey1", "My Favorite Survey",
                "Description of the Survey", questions);

        surveys.add(survey);
    }

    public List<Survey> retrieveAllSurveys() {
        return surveys;
    }

    public Survey retrieveSurveyById(String searchedId) {
        Optional<Survey> optionalSurvey = surveys.stream().filter(o -> o.getId().equals(searchedId)).findFirst();

        return optionalSurvey.orElse(null);
    }

    public List<Question> retrieveAllSurveyQuestions(String searchedId) {
        Survey survey = retrieveSurveyById(searchedId);

        if(survey == null) return null;

        return survey.getQuestions();
    }

    public Question retrieveSpecificSurveyQuestion(String surveyId, String questionId) {
        Optional<Question> optionalQuestion = retrieveAllSurveyQuestions(surveyId).stream().filter(o -> o.getId().equals(questionId)).findFirst();

        return optionalQuestion.orElse(null);
    }

    public String addNewSurveyQuestion(String surveyId, Question question) {
        List<Question> questions = retrieveAllSurveyQuestions(surveyId);

        question.setId(generateRandomId());

        questions.add((question));

        return question.getId();
    }

    private String generateRandomId() {

        SecureRandom secureRandom = new SecureRandom();

        return new BigInteger(32, secureRandom).toString();
    }

    public String deleteSurveyQuestion(String surveyId, String questionId) {
        List<Question> questions = retrieveAllSurveyQuestions(surveyId);

        if(questions == null) return null;

        boolean removed = questions.removeIf(o -> o.getId().equals(questionId));

        if(!removed) return null;

        return questionId;
    }
}

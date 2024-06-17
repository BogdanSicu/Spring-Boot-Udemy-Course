package com.munte.section8_rest_api.survey;

import java.util.List;

public class Question {

    private String id;
    private String description;
    private List<String> options;
    private String correctAnswer;

    public Question(String id, String description, List<String> options, String correctAnswer) {
        this.id = id;
        this.description = description;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public Question() {
    }

    public String getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

    public List<String> getOptions() {
        return options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Question{");
        sb.append("id='").append(id).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", options=").append(options);
        sb.append(", correctAnswer='").append(correctAnswer).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

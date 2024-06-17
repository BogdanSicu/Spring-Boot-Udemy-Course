package com.munte.section8_rest_api.survey;

import java.util.List;

public class Survey {

    private String id;
    private String title;
    private String description;
    private List<Question> questions;

    public Survey(String id, String title, String description, List<Question> questions) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.questions = questions;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Survey{");
        sb.append("id='").append(id).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", questions=").append(questions);
        sb.append('}');
        return sb.toString();
    }
}

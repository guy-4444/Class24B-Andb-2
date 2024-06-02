package com.guy.class24b_andb_2;

public class Question {

    private String image = "";
    private String[] answers = new String[]{};

    public Question() {}

    public String getImage() {
        return image;
    }

    public Question setImage(String image) {
        this.image = image;
        return this;
    }

    public String[] getAnswers() {
        return answers;
    }

    public Question setAnswers(String[] answers) {
        this.answers = answers;
        return this;
    }
}

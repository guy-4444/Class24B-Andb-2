package com.guy.common;

import static java.util.Collections.shuffle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameManager {

    private int currentQuestion = 0;

    private ArrayList<Question> questions;

    public GameManager(DataManagerBase dataManager) {
        questions = dataManager.getQuestions();
    }

    public String getCurrentImage() {
        return questions.get(currentQuestion).getImage();
    }

    public String[] getAnswers() {
        List<String> shuffled = Arrays.asList(questions.get(currentQuestion).getAnswers());
        Collections.shuffle(shuffled);
        String[] answers = shuffled.toArray(new String[0]);

        return answers;
    }
}

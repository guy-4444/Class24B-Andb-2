package com.guy.animals;

import com.guy.common.DataManagerBase;
import com.guy.common.Question;

import java.util.ArrayList;

public class DataManagerAnimals extends DataManagerBase {

    @Override
    public ArrayList<Question> getQuestions() {
        ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question()
                .setImage("https://cdn.mos.cms.futurecdn.net/snvWHcGBeh6zwFMPsi8bDN-1920-80.jpg")
                .setAnswers(new String[]{"Panda", "Lion", "Crocodile", "Elephant"}));

        questions.add(new Question()
                .setImage("https://www.usnews.com/object/image/00000186-0f0d-da67-a5ef-2f5f87990000/2023-lucid-air-1.jpg")
                .setAnswers(new String[]{"Lucid", "Maserati", "Ferrari", "Mitsubishi"}));

        questions.add(new Question()
                .setImage("")
                .setAnswers(new String[]{"", "", "", ""}));


        return questions;
    }
}
package com.guy.common;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import com.bumptech.glide.Glide;
import com.google.android.material.button.MaterialButton;

public class Activity_PanelBase extends AppCompatActivity {

    protected DataManagerBase dataManagerBase;

    private AppCompatImageView panel_IMG_question;
    private MaterialButton[] panel_BTN_answers;
    private AppCompatImageView[] panel_IMG_hearts;

    private GameManager gameManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panel);

        findViews();

        gameManager = new GameManager(dataManagerBase);
        next();

    }

    private void next() {
        String image = gameManager.getCurrentImage();
        Glide.with(this).load(image).into(panel_IMG_question);

        String[] answers = gameManager.getAnswers();
        for (int i = 0; i < 4; i++) {
            panel_BTN_answers[i].setText(answers[i]);
        }
    }

    private void findViews() {
        panel_IMG_question = findViewById(R.id.panel_IMG_question);
        panel_BTN_answers = new MaterialButton[]{
                findViewById(R.id.panel_BTN_answer0),
                findViewById(R.id.panel_BTN_answer1),
                findViewById(R.id.panel_BTN_answer2),
                findViewById(R.id.panel_BTN_answer3),
        };
        panel_IMG_hearts = new AppCompatImageView[]{
                findViewById(R.id.panel_IMG_hearts0),
                findViewById(R.id.panel_IMG_hearts1),
                findViewById(R.id.panel_IMG_hearts2),
                findViewById(R.id.panel_IMG_hearts3),
        };
    }
}
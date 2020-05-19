package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int scoreTeamA = 0;
int scoreTeamB = 0;
int foulsTeamA = 0;
int foulsTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_that_adds_1_point (View view) {
        scoreTeamA +=1;
        displayForTeamA(scoreTeamA);
    }

    public void button_that_adds_1_foul_for_team_a (View view) {
        foulsTeamA +=1;
        displayFoulForTeamA(foulsTeamA);
    }

    public void button_that_adds_1_point_for_b (View view) {
        scoreTeamB +=1;
        displayForTeamB(scoreTeamB);}

    public void button_that_adds_1_foul_for_team_b (View view) {
        foulsTeamB +=1;
        displayFoulForTeamB(foulsTeamB);
    }

    public void reset_Button(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        int foulsTeamA = 0;
        int foulsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulsTeamA);
        displayFoulForTeamB(foulsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int foul){
        TextView foulForA = (TextView) findViewById(R.id.fouls_team_a);
        foulForA.setText(String.valueOf(foul));
    }

    public void displayFoulForTeamB(int foul){
        TextView foulForB = (TextView) findViewById(R.id.fouls_team_b);
        foulForB.setText(String.valueOf(foul));
    }

}

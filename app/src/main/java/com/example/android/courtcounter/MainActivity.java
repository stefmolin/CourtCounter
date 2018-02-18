package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA();// set score to 0 upon starting up the app
        displayForTeamB();
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreTeamA));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreTeamB));
    }

    /**
     * Score three-pointer for team A
     */
    public void scoreThreePointerA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA();
    }

    /**
     * Score three-pointer for team A
     */
    public void scoreThreePointerB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB();
    }

    /**
     * Score two-pointer for team A
     */
    public void scoreTwoPointerA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA();
    }

    /**
     * Score two-pointer for team B
     */
    public void scoreTwoPointerB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB();
    }

    /**
     * Score free throw for team A
     */
    public void scoreFreeThrowA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA();
    }

    /**
     * Score free throw for team B
     */
    public void scoreFreeThrowB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB();
    }

    /**
     * Resets the score
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}

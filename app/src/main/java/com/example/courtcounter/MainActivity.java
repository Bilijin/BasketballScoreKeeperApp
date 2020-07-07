package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreA;
    int scoreB;

    /* this method increases team A's points by 3 whenever the +3 points button for team A is clicked */
    public void plus3A(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }

    /* this method increases team A's points by 2 whenever the +2 points button for team A is clicked */
    public void plus2A(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }

    /* this method increases team A's points by 1 whenever the free throw button for team A is clicked */
    public void plusA(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }

    /* this method increases team B's points by 3 whenever the +3 points button for team B is clicked */
    public void plus3B (View view){
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    /* this method increases team B's points by 2 whenever the +2 points button for team B is clicked */
    public void plus2B (View view){
        scoreB = scoreB + 2;
        displayB(scoreB);
    }

    /* this method increases team B's points by 1 whenever the free throw button for team B is clicked */
    public void plusB (View view){
        scoreB = scoreB + 1;
        displayB(scoreB);
    }

    /* this method changes the text in the Score TextView for Team B */
    private void displayA(int number) {
        TextView teamatextview = findViewById(
                R.id.ScoreATextView);
        teamatextview.setText("" + number);
    }

    /* this method changes the text in the Score TextView for Team A */
    private void displayB(int number) {
        TextView teambtextview = findViewById(
                R.id.ScoreBTextView);
        teambtextview.setText("" + number);
    }

    public void reset(View view){
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }
}

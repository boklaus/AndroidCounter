package com.example.android.courtcounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends ActionBarActivity {

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void teamAScore1(View view) {
        this.teamAScore = this.teamAScore + 1;
        this.updateTeamAScore(this.teamAScore);
    }

    public void teamAScore2(View view) {
        this.teamAScore = this.teamAScore + 2;
        this.updateTeamAScore(this.teamAScore);
    }

    public void teamAScore3(View view) {
        this.teamAScore = this.teamAScore + 3;
        this.updateTeamAScore(this.teamAScore);
    }

    private void updateTeamAScore(int number) {
        TextView scoreView = (TextView) findViewById(
                R.id.team_a_score);
        scoreView.setText("" + number);
    }

    public void teamBScore1(View view) {
        this.teamBScore = this.teamBScore + 1;
        this.updateTeamBScore(this.teamBScore);
    }

    public void teamBScore2(View view) {
        this.teamBScore = this.teamBScore + 2;
        this.updateTeamBScore(this.teamBScore);
    }

    public void teamBScore3(View view) {
        this.teamBScore = this.teamBScore + 3;
        this.updateTeamBScore(this.teamBScore);
    }

    private void updateTeamBScore(int number) {
        TextView scoreView = (TextView) findViewById(
                R.id.team_b_score);
        scoreView.setText("" + number);
    }

    public void resetScore(View view) {
        this.teamAScore = 0;
        this.teamBScore = 0;
        updateTeamAScore(0);
        updateTeamBScore(0);
    }
}

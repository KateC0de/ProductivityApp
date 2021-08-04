package com.example.to_do_application;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout toDo, timer, goals, progress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        toDo = findViewById(R.id.layoutToDo);
        timer = findViewById(R.id.layoutTimer);
        goals = findViewById(R.id.layoutGoal);
        progress = findViewById(R.id.layoutProgress);

        toDo.setOnClickListener(this);
        timer.setOnClickListener(this);
        goals.setOnClickListener(this);
        progress.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.layoutToDo:
                i = new Intent(this, ToDo.class);
                startActivity(i);
                break;
            case R.id.layoutTimer:
                i = new Intent(this, Timer.class);
                startActivity(i);
                break;
            case R.id.layoutGoal:
                i = new Intent(this, Goals.class);
                startActivity(i);
                break;
            case R.id.layoutProgress:
                i = new Intent(this, Progress.class);
                startActivity(i);
                break;
            default:break;

        }
    }
}
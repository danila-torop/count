package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button setTimer; // transition to timers activity
    Button getCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTimer = (Button) findViewById(R.id.btn_timer_activity);
        setTimer.setOnClickListener(this);

        getCount = (Button) findViewById(R.id.btn_counter_activity);
        getCount.setOnClickListener(this);
    }
    // onClick handler for main Activity screen
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_timer_activity: // handle the transition to timers activity button Click
                Intent intent_timer = new Intent(this, Activity2.class);
                startActivity(intent_timer);
                break;
            case R.id.btn_counter_activity: // handle the transition to timers activity button Click
                Intent intent_counter = new Intent(this, Activity3.class);
                startActivity(intent_counter);
                break;
            default:
                break;
        }
    }
}
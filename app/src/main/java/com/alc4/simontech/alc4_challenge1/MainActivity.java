package com.alc4.simontech.alc4_challenge1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the different buttons of this activity and assign actions
        Button btFirst = (Button) findViewById(R.id.bt_first);
        btFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the About ALC activity here through an explicit Intent
                Intent abouAlcIntent = new Intent(MainActivity.this, AboutAlcActivity.class);
                startActivity(abouAlcIntent);
            }
        });

        Button btSecond = (Button) findViewById(R.id.bt_second);
        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the My Profile activity here through an explicit Intent
                Intent myProfileIntent = new Intent(MainActivity.this, MyProfileActivity.class);
                startActivity(myProfileIntent);
            }
        });

    }
}

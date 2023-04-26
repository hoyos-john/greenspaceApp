package com.example.greenspace_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Object for the button
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialise the button
        button = findViewById(R.id.loginButton);

        //Set onClick Listener
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent to call new activity ,the below code does not include this
                Intent intent = new Intent(MainActivity.this, ConservationEvents.class);
                startActivity(intent);

            }
        });
    }
}
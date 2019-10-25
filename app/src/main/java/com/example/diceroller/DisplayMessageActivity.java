package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
    }

    public void sendMessage(View view) {
        //this method takes you back to main screen (MainActivity.java)
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


}

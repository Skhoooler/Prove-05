package com.doria.david.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayScripture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_scripture);
        Intent intent = getIntent();
        String scripture = intent.getExtras().getString("scripture");
        TextView textView5 = (TextView) findViewById(R.id.textView5);
        textView5.setText(scripture);
    }



}

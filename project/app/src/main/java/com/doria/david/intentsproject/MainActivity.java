package com.doria.david.intentsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){
        Intent displayScripture = new Intent(this, DisplayScripture.class);

        EditText getBook    = (EditText) findViewById(R.id.scripture_book);
        EditText getChapter = (EditText) findViewById(R.id.scripture_chapter);
        EditText getVerse   = (EditText) findViewById(R.id.scripture_verse);

        //String scripture = getBook.getText().toString()    + " " +
                           //getChapter.getText().toString() + ":" +
                           //getVerse.getText().toString();


        startActivity(displayScripture);
    }
}

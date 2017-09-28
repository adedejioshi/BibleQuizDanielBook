package com.example.gsa.biblequizdanielbook;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * This function gets the name of the user and saves it as variables Person
     * Saves the variables in a bundle, and starts the QuestionActivity if the username is not empty: if empty, displays a toast.
     */
    public void startQuestion(View view) {

        //To get the Quiz Writer's name
        EditText name = (EditText) findViewById(R.id.name);
        String Person = name.getText().toString();
        Context context = getApplicationContext();
        CharSequence alert = "Hey, Fill The Field Before You Continue";
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, alert, duration);
        if ((Person.length() == 0)) {
            toast.show();
        } else {
            Intent i = new Intent(this, Question.class);
            i.putExtra("name", Person);
            startActivity(i);


        }
    }
}

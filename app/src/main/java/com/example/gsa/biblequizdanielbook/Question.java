package com.example.gsa.biblequizdanielbook;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class Question extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
    }


    public void submitQuiz(View view) {

        /*
         * Declare initial value of answer as Zero
         */
        int answer=0;
        String wrongAnswer="";

        //To get the Quiz Writer's name
        Bundle bundle = getIntent().getExtras();
        String Person = bundle.getString("name");



        //To get answer for question1
        //Is the button checked
        RadioButton Q1a =(RadioButton)findViewById(R.id.Q1a);
        boolean checkedQ1a=Q1a.isChecked();

        //question1 grading
        if (checkedQ1a){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 1: Wrong Answer";
        }

        //To get answer for question2
        //Is the button checked
        RadioButton Q2c =(RadioButton)findViewById(R.id.Q2c);
        boolean checkedQ2c=Q2c.isChecked();

        //question2 grading
        if (checkedQ2c){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 2: Wrong Answer";
        }

        //To get answer for question3
        //Is the button checked
        RadioButton Q3d =(RadioButton)findViewById(R.id.Q3d);
        boolean checkedQ3d=Q3d.isChecked();

        //question3 grading
        if (checkedQ3d){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 3: Wrong Answer";
        }

        //To get answer for question4
        //Is the button checked
        RadioButton Q4a =(RadioButton)findViewById(R.id.Q4a);
        boolean checkedQ4a=Q4a.isChecked();

        //question4 grading
        if (checkedQ4a){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 4: Wrong Answer";
        }

        //To get answer for question5
        //Is the button checked
        RadioButton Q5c =(RadioButton)findViewById(R.id.Q5c);
        boolean checkedQ5c=Q5c.isChecked();

        //question5 grading
        if (checkedQ5c){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 5: Wrong Answer";
        }

        //To get answer for question6
        //Is the button checked
        RadioButton Q6a =(RadioButton)findViewById(R.id.Q6a);
        boolean checkedQ6a=Q6a.isChecked();

        //question6 grading
        if (checkedQ6a){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 6: Wrong Answer";
        }

        //To get answer for question7
        //Is the button checked
        RadioButton Q7d =(RadioButton)findViewById(R.id.Q7d);
        boolean checkedQ7d=Q7d.isChecked();

        //question7 grading
        if (checkedQ7d){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 7: Wrong Answer";
        }

        //To get answer for question8
        //Is the button checked
        RadioButton Q8b =(RadioButton)findViewById(R.id.Q8b);
        boolean checkedQ8b=Q8b.isChecked();

        //question8 grading
        if (checkedQ8b){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 8: Wrong Answer";
        }

        //To get answer for question9
        //Is the button checked
        RadioButton Q9b =(RadioButton)findViewById(R.id.Q9b);
        boolean checkedQ9b=Q9b.isChecked();

        //question9 grading
        if (checkedQ9b){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 9: Wrong Answer";
        }

        //To get answer for question10
        //Is the button checked
        RadioButton Q10d =(RadioButton)findViewById(R.id.Q10d);
        boolean checkedQ10d=Q10d.isChecked();

        //question10 grading
        if (checkedQ10d){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 10: Wrong Answer";
        }

        //To get answer for question11
        //Is the button checked
        RadioButton Q11a =(RadioButton)findViewById(R.id.Q11a);
        boolean checkedQ11a=Q11a.isChecked();

        //question11 grading
        if (checkedQ11a){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 11: Wrong Answer";
        }

        //To get answer for question12
        //Is the button checked
        RadioButton Q12c =(RadioButton)findViewById(R.id.Q12c);
        boolean checkedQ12c=Q12c.isChecked();

        //question12 grading
        if (checkedQ12c){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 12: Wrong Answer";
        }

        //To get answer for question13
        //Is the button checked
        RadioButton Q13a =(RadioButton)findViewById(R.id.Q13a);
        boolean checkedQ13a=Q13a.isChecked();

        //question13 grading
        if (checkedQ13a){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 13: Wrong Answer";
        }

        //To get answer for question14
        //Is the button checked
        RadioButton Q14c =(RadioButton)findViewById(R.id.Q14c);
        boolean checkedQ14c=Q14c.isChecked();

        //question14 grading
        if (checkedQ14c){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 14: Wrong Answer";
        }

        //To get the answer15
        EditText text15 = (EditText) findViewById(R.id.answer15);
        String answer15 = text15.getText().toString();

        //question15 grading
        if (answer15.equals("Angel")||answer15.equals("An Angel")){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 15: Wrong Answer";
        }

        //To get the answer16
        EditText text16 = (EditText) findViewById(R.id.answer16);
        String answer16 = text16.getText().toString();

        //question16 grading
        if (answer16.equals("Belshazzar")||answer16.equals("King Belshazzar")){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 16: Wrong Answer";
        }

        //To get the answer17
        EditText text17 = (EditText) findViewById(R.id.answer17);
        String answer17 = text17.getText().toString();


        //question17 grading
        if (answer17.equalsIgnoreCase("Daniel")){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 17: Wrong Answer";
        }

        //To get answers for question18
        CheckBox Q18a=(CheckBox)findViewById(R.id.Q18a);
        boolean checkedQ18a=Q18a.isChecked();
        CheckBox Q18c=(CheckBox)findViewById(R.id.Q18c);
        boolean checkedQ18c=Q18c.isChecked();
        CheckBox Q18d=(CheckBox)findViewById(R.id.Q18d);
        boolean checkedQ18d=Q18d.isChecked();

        //question18 grading
        if (checkedQ18a && checkedQ18c && checkedQ18d){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 18: Wrong Answer";
        }

        //To get answers for question19
        CheckBox Q19c=(CheckBox)findViewById(R.id.Q19c);
        boolean checkedQ19c=Q19c.isChecked();
        CheckBox Q19d=(CheckBox)findViewById(R.id.Q19d);
        boolean checkedQ19d=Q19d.isChecked();

        //question19 grading
        if (checkedQ19c && checkedQ19d){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 19: Wrong Answer";
        }

        //To get answers for question20
        CheckBox Q20b=(CheckBox)findViewById(R.id.Q20b);
        boolean checkedQ20b=Q20b.isChecked();
        CheckBox Q20c=(CheckBox)findViewById(R.id.Q20c);
        boolean checkedQ20c=Q20c.isChecked();
        CheckBox Q20e=(CheckBox)findViewById(R.id.Q20e);
        boolean checkedQ20e=Q20e.isChecked();
        CheckBox Q20f=(CheckBox)findViewById(R.id.Q20f);
        boolean checkedQ20f=Q20f.isChecked();

        //question20 grading
        if (checkedQ20b && checkedQ20c && checkedQ20e && checkedQ20f){
            answer = answer+1;
        }else {
            wrongAnswer=wrongAnswer + "\n Question 20: Wrong Answer";
        }

        //To display result Toast message
        if (answer==20){
            Context context = getApplicationContext();
            String result = "\t\tExcellent Grade by " + Person + "!";
            result +="\n" +"You answered " + "All the questions correctly";
            result += "\n\t\t Grade: 100%";
            int duration = Toast.LENGTH_LONG;
            Toast toastMessage = Toast.makeText(context, result, duration);
            toastMessage.show();}

        else{
            Context context = getApplicationContext();
            String result = "\tTry Again " + Person + "!";
            result +="\n" +"You answered " + answer + " questions correctly";
            result += "\n Grade: " + answer*5 +"%";
            result += "\n Check the Following Questions:";
            result += "\n" + wrongAnswer;
            int duration = Toast.LENGTH_LONG;
            Toast toastMessage = Toast.makeText(context, result, duration);
            toastMessage.show();
        }
    }

}
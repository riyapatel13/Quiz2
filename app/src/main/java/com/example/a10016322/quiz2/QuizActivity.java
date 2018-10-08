package com.example.a10016322.quiz2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {//interface part1

    Button button;
    Button button2;
    TextView text1;
    TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        button = (Button)(findViewById(R.id.button));
        button2 = (Button)(findViewById(R.id.button2));
        text1 = (TextView)(findViewById(R.id.textView));
        text2 = (TextView)(findViewById(R.id.textView2));

        button.setOnClickListener(new View.OnClickListener() { //anonymous inner class
            @Override
            public void onClick(View v) {
                if ((v.getId()== R.id.button)&& text1.getText().equals("Not Clicked"))
                    text1.setText("Clicked");
                else
                    text1.setText("Not Clicked");
            }
        });
        button2.setOnClickListener(this); //interface part 3
    }

    public void onClick(View view) //interface part 2
    {
        if (text2.getText().equals("Not Clicked"))
            text2.setText("Clicked");
        else
            text2.setText("Not Clicked");
    }

}

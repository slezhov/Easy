package com.simple.easy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Simple extends AppCompatActivity {

    TextView question, result;
    EditText name;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        question = (TextView)findViewById(R.id.question);
        button = (Button)findViewById(R.id.button);
        name = (EditText)findViewById(R.id.name);
        result = (TextView)findViewById(R.id.result);
    }
    public void result(View view) {
        String Name = name.getText().toString();
        result.setText("Hello, " + Name);
        button.setVisibility(View.GONE);
        question.setVisibility(View.GONE);
        name.setVisibility(View.GONE);
        result.setVisibility(View.VISIBLE);
    }
}

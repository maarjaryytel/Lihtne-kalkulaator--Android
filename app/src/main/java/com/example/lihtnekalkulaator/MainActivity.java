package com.example.lihtnekalkulaator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick (View v) {
        EditText obj1 = (EditText)findViewById(R.id.Num1);
        EditText obj2 = (EditText)findViewById(R.id.Num2);
        TextView resText =(TextView)findViewById(R.id.Result);

        int number1 = Integer.parseInt(obj1.getText().toString());
        int number2 = Integer.parseInt(obj2.getText().toString());
        int resSum = number1 + number2;
        resText.setText(Integer.toString(resSum));
    }
}

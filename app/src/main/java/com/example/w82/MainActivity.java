package com.example.w82;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Edit1;
    private EditText Edit2;
    private TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edit1 = findViewById(R.id.editText1);
        Edit2 = findViewById(R.id.editText2);
        textOutput = findViewById(R.id.outputview);

    }
    public void sum(View view) {
        int i1 = Integer.parseInt(Edit1.getText().toString());
        int i2 = Integer.parseInt(Edit2.getText().toString());
        int result = i1+i2;
        System.out.println(result);
        textOutput.setText(String.valueOf(result));
    }
    public void substract(View view) {
        int i1 = Integer.parseInt(Edit1.getText().toString());
        int i2 = Integer.parseInt(Edit2.getText().toString());
        int result = i1-i2;
        System.out.println(result);
        textOutput.setText(String.valueOf(result));
    }
    public void multiply(View view) {
        int i1 = Integer.parseInt(Edit1.getText().toString());
        int i2 = Integer.parseInt(Edit2.getText().toString());
        int result = i1*i2;
        System.out.println(result);
        textOutput.setText(String.valueOf(result));
    }
    public void divide(View view) {

        int i1 = Integer.parseInt(Edit1.getText().toString());
        int i2 = Integer.parseInt(Edit2.getText().toString());
        if(i2==0){
            textOutput.setText("Zero division undefined");
            return;
        }
        int result = i1/i2;
        System.out.println(result);
        textOutput.setText(String.valueOf(result));
    }
}

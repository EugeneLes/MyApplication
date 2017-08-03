package com.example.eugene.homework1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eugene.myapplication.R;

public class HomeWork1Activity extends AppCompatActivity {
    private TextView textView1;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work1);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView1 = (TextView) findViewById(R.id.textView2);
        Button startButton = (Button) findViewById(R.id.button);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                try {
                    CharSequence charSeq = textView1.getText();
                    textView1.setText(textView2.getText());
                    textView2.setText(charSeq);
                } catch (NumberFormatException e) {
                    // method ignores invalid (non-integer) input and waits
                    // for something it can use
                }
            }
        });
    }

}

package com.example.eugene.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.eugene.classwork4.ClassWork4Activity;
import com.example.eugene.classwork5.ClassWork5Activity;
import com.example.eugene.homework1.HomeWork1Activity;
import com.example.eugene.homework4.HomeWork4Activity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonHW1 = (Button) findViewById(R.id.buttonHW1);
        buttonHW1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeWork1Activity.class);
//            overridePendingTransition(R.anim.sdfsdfs, R.anim.sdfsdfs); //TODO: to change the animation
                startActivity(intent);
            }
        });

        Button buttonCW4 = (Button) findViewById(R.id.buttonCW4);
        buttonCW4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClassWork4Activity.class);
//            overridePendingTransition(R.anim.sdfsdfs, R.anim.sdfsdfs);
                startActivity(intent);
            }
        });
        Button buttonHW4 = (Button) findViewById(R.id.buttonHW4);
        buttonHW4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HomeWork4Activity.class);
//            overridePendingTransition(R.anim.sdfsdfs, R.anim.sdfsdfs); //TODO: to change the animation
                startActivity(intent);
            }
        });
        Button buttonCW5 = (Button) findViewById(R.id.buttonCW5);
        buttonCW5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ClassWork5Activity.class);
//            overridePendingTransition(R.anim.sdfsdfs, R.anim.sdfsdfs);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
    //    protected void onTextView1Click(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
}

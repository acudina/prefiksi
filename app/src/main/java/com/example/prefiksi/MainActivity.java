package com.example.prefiksi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_10, btn_go, btn_next;
    TextView tv_computerChoice, tv_playerChoice, tv_playerAnswer;
    ImageView iv_computerChoice, iv_playerChoice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_10 = (Button) findViewById(R.id.btn_10);
        btn_go = (Button) findViewById(R.id.btn_go);


        tv_computerChoice = (TextView) findViewById(R.id.tv_computerChoice);
        tv_playerChoice = (TextView) findViewById(R.id.tv_playerChoice);
        tv_playerAnswer = (TextView) findViewById(R.id.tv_playerAnswer);

        //iv_computerChoice.setVisibility(View.INVISIBLE);
        iv_playerChoice.setVisibility(View.INVISIBLE);



        //----------------------------------------------

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //Button OFF-----

    }


}

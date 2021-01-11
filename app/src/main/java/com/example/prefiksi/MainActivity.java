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
    //private int [] answerArray;


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
        btn_next = (Button) findViewById(R.id.btn_next);


        iv_computerChoice = (ImageView) findViewById(R.id.iv_computerChoice);
        iv_playerChoice = (ImageView) findViewById(R.id.iv_playerChoice);

        tv_computerChoice = (TextView) findViewById(R.id.tv_computerChoice);
        tv_playerChoice = (TextView) findViewById(R.id.tv_playerChoice);
        tv_playerAnswer = (TextView) findViewById(R.id.tv_playerAnswer);

        btn_go.setVisibilityplayer_choice;
        //iv_computerChoice.setVisibility(View.INVISIBLE);
        iv_playerChoice.setVisibility(View.INVISIBLE);



        //----------------------------------------------

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = play_turn();
                iv_playerChoice.setVisibility(View.INVISIBLE);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerChoice = "deka";
                iv_playerChoice.setVisibility(View.VISIBLE);
                iv_playerChoice.setImageResource(R.drawable.deka);

                //Toast.makeText(MainActivity.this, "" + playerChoice, Toast.LENGTH_SHORT).show();
//                if(computer_choice == playerChoice) {
//                    play_turn("deka");
//                }else{
//                    tv_playerAnswer.setText("wrong");
//                }


            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String playerChoice = "hekto";
                iv_playerChoice.setVisibility(View.VISIBLE);
                iv_playerChoice.setImageResource(R.drawable.hekto);

                //Toast.makeText(MainActivity.this, "" + playerChoice, Toast.LENGTH_SHORT).show();
//                if(computer_choice == playerChoice) {
//                    play_turn("hekto");
//                }else{
//                    tv_playerAnswer.setText("wrong");
//                }


            }

        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //Button OFF-----

    }


    private String play_turn() {
        String computer_choice = "";
        Random r = new Random();

        //chose 1, 2 or 3
        int computer_choice_number = r.nextInt(2) + 1;

        if (computer_choice_number == 1) {
            computer_choice = "deka";
        } else
        if (computer_choice_number == 2) {
            computer_choice = "hekto";
        } else
        if (computer_choice_number == 3) {
            computer_choice = "kilo";
        }

        //set the computer image based on his choice
        if (computer_choice == "deka") {
            iv_computerChoice.setImageResource(R.drawable.deka);
        } else
        if (computer_choice == "hekto") {
            iv_computerChoice.setImageResource(R.drawable.hekto);
        } else
        if (computer_choice == "kilo") {
            iv_computerChoice.setImageResource(R.drawable.kilo);
        }
        //return "not shure";

        //usporedba slika i udlučivanje tko povbjeđuje

        if (player_choice == computer_choice) {
            return "Draw. Nobody won";
        }
        else if (player_choice == "kamen" && computer_choice == "skare") {
            //HumanScore++;
            return "Kamen gnjeći škara. Igrać pobjeđuje";
        }
        else if (player_choice == "skare" && computer_choice == "kamen") {
            //ComputerScore++;
            return "Kamen gnjeći škara. Computer pobjeđuje";
        }

        if(computer_choice == player_choice) {
            play_turn();
        }else{
            tv_playerAnswer.setText("wrong");
        }
            return "not shure";
    }

}

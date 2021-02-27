package com.example.flashcard;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**findViewById(R.id.FC_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //findViewById(R.id.FC_question).setVisibility(View.INVISIBLE);
                //findViewById(R.id.FC_answer).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.FC_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //findViewById(R.id.FC_answer).setVisibility(View.INVISIBLE);
                //findViewById(R.id.FC_question).setVisibility(View.VISIBLE);
            }
        });**/

        findViewById(R.id.FC_answerA).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                findViewById(R.id.FC_answerA).setBackgroundColor(getResources().getColor(R.color.Green, null));
                //findViewById(R.id.FC_question).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.FC_answerB).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                findViewById(R.id.FC_answerB).setBackgroundColor(getResources().getColor(R.color.Magenta, null));
                findViewById(R.id.FC_answerA).setBackgroundColor(getResources().getColor(R.color.Green, null));
                //findViewById(R.id.FC_question).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.FC_answerC).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                findViewById(R.id.FC_answerC).setBackgroundColor(getResources().getColor(R.color.Purple, null));
                findViewById(R.id.FC_answerA).setBackgroundColor(getResources().getColor(R.color.Green, null));
                //findViewById(R.id.FC_question).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.FC_answerD).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                findViewById(R.id.FC_answerD).setBackgroundColor(getResources().getColor(R.color.Red, null));
                findViewById(R.id.FC_answerA).setBackgroundColor(getResources().getColor(R.color.Green, null));
                //findViewById(R.id.FC_question).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.FC_Screen).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                findViewById(R.id.FC_answerA).setBackgroundColor(getResources().getColor(R.color.Orange, null));
                findViewById(R.id.FC_answerB).setBackgroundColor(getResources().getColor(R.color.Orange, null));
                findViewById(R.id.FC_answerC).setBackgroundColor(getResources().getColor(R.color.Orange, null));
                findViewById(R.id.FC_answerD).setBackgroundColor(getResources().getColor(R.color.Orange, null));

                findViewById(R.id.FC_answerA).setVisibility(View.VISIBLE);
                findViewById(R.id.FC_answerB).setVisibility(View.VISIBLE);
                findViewById(R.id.FC_answerC).setVisibility(View.VISIBLE);
                findViewById(R.id.FC_answerD).setVisibility(View.VISIBLE);

            }
        });

        findViewById(R.id.toggle_choices_visibility).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            //If the eye is open, user is preparing to view answers. On click, image is set to close eye, which revels the answers
            public void onClick(View v) {

                ((ImageView) findViewById(R.id.toggle_choices_visibility)).setImageResource(R.drawable.ic_openeye);

                findViewById(R.id.FC_answerA).setVisibility(View.INVISIBLE);
                findViewById(R.id.FC_answerB).setVisibility(View.INVISIBLE);
                findViewById(R.id.FC_answerC).setVisibility(View.INVISIBLE);
                findViewById(R.id.FC_answerD).setVisibility(View.INVISIBLE);

        }
        });

    }

}
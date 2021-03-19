package com.example.flashcard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class AddCardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

        ((ImageView) findViewById(R.id.Cancel)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ((ImageView) findViewById(R.id.Save)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Question = ((EditText) findViewById(R.id.editTextQuestion)).getText().toString();
                String Answer = ((EditText) findViewById(R.id.editTextAnswer)).getText().toString();

                Intent data = new Intent(); // create a new Intent, this is where we will put our data
                data.putExtra("question", Question); // puts one string into the Intent, with the key as 'string1'
                data.putExtra("answer", Answer); // puts another string into the Intent, with the key as 'string2
                setResult(RESULT_OK, data); // set result code and bundle data for response
                finish();
            }
        });
    }
}

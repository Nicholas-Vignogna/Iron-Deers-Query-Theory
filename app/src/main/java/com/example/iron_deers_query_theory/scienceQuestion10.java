package com.example.iron_deers_query_theory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class scienceQuestion10 extends AppCompatActivity {
    private Button SA1;
    private Button SA2;
    private Button SA3;
    private Button SA4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.science_question10);

        SA1 =  findViewById(R.id.sq10_1);
        SA2 = findViewById(R.id.sq10_2);
        SA3 = findViewById(R.id.sq10_3);
        SA4 = findViewById(R.id.sq10_4);
        SA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        SA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        SA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        SA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(scienceQuestion10.this, CategoryUpdate.class);
                startActivity(intent);
            }
        });
    }
}
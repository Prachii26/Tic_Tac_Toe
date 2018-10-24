package com.example.prachi.tic_tac_toe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity{
    EditText text;
    EditText text1;
    String name1,name2;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text= findViewById(R.id.player1);
        text1= findViewById(R.id.player2);
        btn= findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                name1= text .getText().toString();
                name2= text1 .getText().toString();
                Intent intent = new Intent(MainActivity.this, GameActivity.class);
                intent.putExtra("name1", name1);
                intent.putExtra("name2", name2);

                startActivity(intent);
            }


        });}}
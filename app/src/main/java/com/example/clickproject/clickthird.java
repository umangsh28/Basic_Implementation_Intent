package com.example.clickproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class clickthird extends AppCompatActivity {

    private String T="Mainactivity";
    private Button btnfourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clickthird);
        btnfourth =findViewById(R.id.btnfourth);
        btnfourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(clickthird.this,fourthpage.class);
                startActivity(intent);
            }
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(T,"onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(T,"onresume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(T,"onpause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(T,"ondestroy");
    }


    public void fourthnow(View view) {
    }
}
package com.example.clickproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private final String T="Mainactivity";
    private Button btnsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsecond=findViewById(R.id.btnsecond);
        btnsecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Toast.makeText(MainActivity.this,"please wait",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,clickthird.class);
                startActivity(intent);
            }
        });
        Log.d(T,"oncreate");
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



}
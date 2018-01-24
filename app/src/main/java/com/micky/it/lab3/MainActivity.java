package com.micky.it.lab3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String msg1 = "Lab3";
    String msg2 = "Activity 1 : ";
    Button btn;
    //TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg1, msg2 + "onCreate");


        //tv = (TextView)findViewById(R.id.tv1);
        btn = (Button) findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity3.class);
                startActivity(intent);
            }


        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg1, msg2 + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg1, msg2 + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg1, msg2 + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg1, msg2 + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg1, msg2 + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg1, msg2 + "onRestart");
    }

}

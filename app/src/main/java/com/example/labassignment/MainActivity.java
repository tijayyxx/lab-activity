package com.example.labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView oncreate,onstart,onresume,onrestart;
    Button btn;
    static int count1=0;
    static int count2=0;
    static int count3=0;
    static int count4=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oncreate=findViewById(R.id.oncreate);
        onstart=findViewById(R.id.onstart);
        onresume=findViewById(R.id.onresume);
        onrestart=findViewById(R.id.onrestart);
        btn=findViewById(R.id.btn);

        count1++;
        oncreate.setText(String.valueOf(count1));
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,second.class);
                startActivity(intent);
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        count2++;
        onstart.setText(String.valueOf(count2));
    }

    @Override
    protected void onResume() {
        super.onResume();
        count3++;
        onresume.setText(String.valueOf(count3));
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        count4++;
        onrestart.setText(String.valueOf(count4));
    }

}

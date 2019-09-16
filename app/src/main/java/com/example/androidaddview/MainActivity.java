package com.example.androidaddview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        for(int i=0;i<20;i++){
//            TextView tv = new TextView(MainActivity.this);
//            tv.setText(i+1+":ok");
//
//            LinearLayout main = findViewById(R.id.main_linear);
//            main.addView(tv);
//        }

        String[] names = new String[]{"Tuan", "Vi", "Me"};
        LinearLayout main = findViewById(R.id.main_linear);

        for (int i = 0; i < names.length; i++) {
            LinearLayout main2 = new LinearLayout(this);
            main2.setOrientation(LinearLayout.HORIZONTAL);

            Button btn = new Button(MainActivity.this);
            btn.setText("+");

            TextView tv = new TextView(MainActivity.this);
            tv.setText(names[i]);

            main2.addView(tv);
            main2.addView(btn);
        }
    }
}

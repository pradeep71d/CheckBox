package com.example.chekbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox ch1, ch2, ch3, ch4, ch5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = findViewById(R.id.c1);
        ch1.setOnClickListener(this);
        ch2 = findViewById(R.id.c2);
        ch2.setOnClickListener(this);
        ch3 = findViewById(R.id.c3);
        ch3.setOnClickListener(this);
        ch4 = findViewById(R.id.c4);
        ch4.setOnClickListener(this);
        ch5 = findViewById(R.id.c5);
        ch5.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.c1:
                if (ch1.isChecked()){
                    Toast.makeText(this, "ChekBox1", Toast.LENGTH_SHORT).show();
                }
            case R.id.c2:
                if (ch2.isChecked()){
                    Toast.makeText(this, "CheckBox2", Toast.LENGTH_SHORT).show();
                }
            case R.id.c3:
                if (ch3.isChecked()){
                    Toast.makeText(this, "CheckBox3", Toast.LENGTH_SHORT).show();
                }
            case R.id.c4:
                if (ch4.isChecked()){
                    Toast.makeText(this, "CheckBox4", Toast.LENGTH_SHORT).show();
                }
            case R.id.c5:
                if (ch5.isChecked()){
                    Toast.makeText(this, "Checkbox5", Toast.LENGTH_SHORT).show();
                }
        }
    }
}

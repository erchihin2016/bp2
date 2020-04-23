package com.example.bp2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.bp2.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static int generateNumb() {
        Random random = new Random();
        return (random.nextInt(100)+1);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnnext = findViewById(R.id.btnnext);
        final Button btnback = findViewById(R.id.btnback);
        final TextView textView = findViewById(R.id.textView);

        textView.setText(getString(R.string.url) + generateNumb());

        btnnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.this.finish();
            }
        });

    }

}


package com.example.activitydanintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivity extends AppCompatActivity {

    private TextView textView;
    private String kata1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        textView = findViewById(R.id.textextra);
        Intent moveIntent = getIntent();

        kata1 = moveIntent.getStringExtra("kunci");
        textView.setText(kata1);
    }
}
package com.example.ods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btn_ods7;

        btn_ods7 = findViewById(R.id.btn_ods7);
        btn_ods7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tela7 = new Intent(getApplicationContext(), ODS7.class);
                startActivity(tela7);
            }
        }
        );

    }
}
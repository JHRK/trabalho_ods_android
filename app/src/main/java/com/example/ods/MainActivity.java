package com.example.ods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton btnODS11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnODS11 = findViewById(R.id.btnODS11);
        btnODS11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS11.class);
                startActivity(tela11);
            }
        });
    }
}
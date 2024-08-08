package com.example.ods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    ImageButton btnODS1,btnODS2,btnODS3,btnODS4,btnODS5,btnODS6,btnODS7,btnODS8,btnODS9,btnODS10,btnODS11,btnODS12,btnODS13,btnODS14,btnODS15,btnODS16,btnODS17,;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_ods1 = findViewById()

        btnODS1 = findViewById(R.id.btnODS1);
        btnODS1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS1.class);
                startActivity(tela11);
            }
        });
        btnODS2 = findViewById(R.id.btnODS1);
        btnODS2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS2.class);
                startActivity(tela11);
            }
        });
        btnODS3 = findViewById(R.id.btnODS3);
        btnODS3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS3.class);
                startActivity(tela11);
            }
        });
        btnODS4 = findViewById(R.id.btnODS4);
        btnODS4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS4.class);
                startActivity(tela11);
            }
        });
        btnODS5 = findViewById(R.id.btnODS5);
        btnODS5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS5.class);
                startActivity(tela11);
            }
        });
        btnODS6 = findViewById(R.id.btnODS6);
        btnODS6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS6.class);
                startActivity(tela11);
            }
        });
        btnODS7 = findViewById(R.id.btnODS7);
        btnODS7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS7.class);
                startActivity(tela11);
            }
        });
        btnODS8 = findViewById(R.id.btnODS8);
        btnODS8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS8.class);
                startActivity(tela11);
            }
        });
        btnODS9 = findViewById(R.id.btnODS9);
        btnODS9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS9.class);
                startActivity(tela11);
            }
        });
        btnODS10 = findViewById(R.id.btnODS10);
        btnODS10.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS10.class);
                startActivity(tela11);
            }
        });
        btnODS11 = findViewById(R.id.btnODS11);
        btnODS11.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS11.class);
                startActivity(tela11);
            }
        });
        btnODS12 = findViewById(R.id.btnODS12);
        btnODS12.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS12.class);
                startActivity(tela11);
            }
        });
        btnODS13 = findViewById(R.id.btnODS3);
        btnODS13.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS13.class);
                startActivity(tela11);
            }
        });
        btnODS14 = findViewById(R.id.btnODS14);
        btnODS14.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS14.class);
                startActivity(tela11);
            }
        });
        btnODS15 = findViewById(R.id.btnODS15);
        btnODS15.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS15.class);
                startActivity(tela11);
            }
        });
        btnODS16 = findViewById(R.id.btnODS16);
        btnODS16.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS16.class);
                startActivity(tela11);
            }
        });
        btnODS17 = findViewById(R.id.btnODS17);
        btnODS17.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent tela11 = new Intent(getApplicationContext(), ODS17.class);
                startActivity(tela11);
            }
        });

    }
}
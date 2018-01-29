package com.example.jjuarez.noassemblyrequired;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //will launch bicycle activity when image button is selected
        ImageButton buttonBicycle = (ImageButton) findViewById(R.id.btnImgBicycle);
        buttonBicycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Bicycle.class));
            }
        });

        //will launch dresser activity when image button is selected
        ImageButton btnDresser = (ImageButton) findViewById(R.id.btnImgDresser);
        btnDresser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Dresser.class));
            }
        });

        //will launch patio activity when image button is selected
        ImageButton btnPatio = (ImageButton) findViewById(R.id.btnImgPatio);
        btnPatio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Patio.class));
            }
        });
    }
}

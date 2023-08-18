package com.example.appexerc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtInicio;
    private Button btnExerc1, btnExerc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExerc1 = findViewById(R.id.btnExerc1);

        btnExerc1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Exerc1 = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(Exerc1);
            }
        });
    }
}
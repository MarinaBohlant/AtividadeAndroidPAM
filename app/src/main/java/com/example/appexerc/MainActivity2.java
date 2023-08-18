package com.example.appexerc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtView1, txtView2, txtResult;
    private EditText txtNum1, txtNum2;
    private Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
    }

    public void onClick(View v){
        int vl1 = Integer.parseInt(txtNum1.toString());
        int vl2 = Integer.parseInt(txtNum2.toString());

        if (vl1 % vl2 == 0 || vl2 % vl1 == 0) {
            txtResult.setText("Esses números são múltiplos.");
        }
        else{
            txtResult.setText("Esses números não são múltiplos.");
        }
    }
}
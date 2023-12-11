package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView t_v;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        t_v = findViewById(R.id.TextV);
        rb1 = findViewById(R.id.radioButton);
        rb2 = findViewById(R.id.radioButton2);
        rb3 = findViewById(R.id.radioButton3);
        rb4 = findViewById(R.id.radioButton4);
    }

    public void operar(View v){
        String t1 = et1.getText().toString();
        String t2 = et2.getText().toString();

        int v1 = Integer.parseInt(t1);
        int v2 = Integer.parseInt(t2);

        if(rb1.isChecked()){
            int resultado = v1*v2;
            t_v.setText("La multiplicacion es: " + resultado);
        }else if(rb2.isChecked()){
            int resultado = v1/v2;
            t_v.setText("La division es: " + resultado);
        }else if(rb3.isChecked()){
            int resultado = v1-v2;
            t_v.setText("La resta es: " + resultado);
        } else if(rb1.isChecked()){
            int resultado = v1+v2;
            t_v.setText("La suma es: " + resultado);
        }

    }

}
package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button boton_suma;
    private Button boton_resta;
    private Button boton_division;
    private Button boton_multiplicacion;

    private TextView text_respuesta;

    private EditText edit_num_uno;
    private EditText edit_num_dos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_respuesta = findViewById(R.id.resultado);

        edit_num_uno = findViewById(R.id.num1);
        edit_num_dos = findViewById(R.id.num2);






        boton_suma = findViewById(R.id.button_suma);
        boton_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( suma( Integer.parseInt(edit_num_uno.getText().toString()),Integer.parseInt(edit_num_dos.getText().toString()) )+"");
            }
        });


        boton_division = findViewById(R.id.button_division);
        boton_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( division( Integer.parseInt(edit_num_uno.getText().toString()),Integer.parseInt(edit_num_dos.getText().toString()) )+"");

            }
        });

        boton_multiplicacion = findViewById(R.id.button_multiplicacion);
        boton_multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( multiplicacion( Integer.parseInt(edit_num_uno.getText().toString()),Integer.parseInt(edit_num_dos.getText().toString()) )+"");

            }
        });

        boton_resta = findViewById(R.id.button_resta);
        boton_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_respuesta.setText( resta( Integer.parseInt(edit_num_uno.getText().toString()),Integer.parseInt(edit_num_dos.getText().toString()) )+"");

            }
        });

    }

    public double suma (int a, int b){
        return a+b;
    }

    public double resta (int a, int b){
        return a-b;
    }

    public double multiplicacion (int a, int b){
        return a*b;
    }

    public double division (int a, int b){
        int respuesta = 0;

        if (b!=0){
            respuesta=a/b;
        }

        return respuesta;
    }
}
package com.example.desarrollouf2_enrique_ruiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Insertar extends AppCompatActivity {
    BD bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insertar);
    }

    public void insertar(View view) {
        //obtener valor de los EditText
        EditText nombre = findViewById(R.id.editText_nombre);
        String nombre1 = nombre.getText().toString();

        EditText apellido = findViewById(R.id.editText_main2_apellido);
        String apellido1 = apellido.getText().toString();

        EditText edad = findViewById(R.id.editText3_main2_edad);
        String edad1 = edad.getText().toString();

        int edad2 = Integer.parseInt(edad1);
        //los datos se van enviando continuamente
        bd.insertData(nombre1, apellido1, edad2, this);
    }
}

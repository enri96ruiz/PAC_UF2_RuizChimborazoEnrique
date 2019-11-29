package com.example.desarrollouf2_enrique_ruiz;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Consultar extends AppCompatActivity {
    BD bd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consultar);
    }

    public void consultar(View view) {
        bd = new BD(this, "m08", null, 1);
        EditText editText_ID = findViewById(R.id.editText_ID_Consultar);
        String editeText_ID_1 = editText_ID.getText().toString();
        int editeText_ID_2 = Integer.parseInt(editeText_ID_1);
        //El resultado de la consulta lo obtendremos en forma de cursor
        Cursor resultado = bd.consultar(editeText_ID_2);

        EditText editText_nombre = findViewById(R.id.editText2_nombre_consultar),
                editText_apellido = findViewById(R.id.editText3_apellido_consultar),
                editText_edad = findViewById(R.id.editText4_edad_consultar);

        if (resultado.moveToFirst()) {
            //Recorremos el cursor hasta que no haya más registros
            do {
                String name = resultado.getString(1);
                String apellido = resultado.getString(2);
                String edad = resultado.getString(3);

                editText_nombre.setText(name);
                editText_apellido.setText(apellido);
                editText_edad.setText(edad);
            } while (resultado.moveToNext());

        }
    }
}

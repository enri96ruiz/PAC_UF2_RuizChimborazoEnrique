package com.example.desarrollouf2_enrique_ruiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    BD bd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    public void create_table(View view) {
        bd = new BD(this, "m08", null, 1);
    }

    public void insert(View view) {
        Intent intent = new Intent(this, Insertar.class);
        startActivity(intent);

    }

    public void volver_Activity1(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        finish();
    }
}
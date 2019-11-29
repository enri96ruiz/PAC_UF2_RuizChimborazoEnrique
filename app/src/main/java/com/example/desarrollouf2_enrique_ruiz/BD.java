package com.example.desarrollouf2_enrique_ruiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class BD extends SQLiteOpenHelper {
    public BD(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            String table = "CREATE TABLE alumno" +
                    "(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "nombre TEXT, " +
                    "apellido TEXT, " +
                    "edad INTEGER)";
            db.execSQL(table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void insertData(String nombre, String apellido, int edad, Context context){
        //creamos un objeto SQLiteDatabase de tipo escritura
        SQLiteDatabase escritura = getWritableDatabase();
        String insert ="INSERT INTO alumno (nombre,apellido,edad) " +
                "VALUES(\""+nombre+"\",\""+apellido+"\","+edad+")";
        //ya podremos insertar damos a nuestra bd
        escritura.execSQL(insert);
        //cerramos el objeto SQLiteDatabase creado
        Toast.makeText(context,"Inserción realizada correctamente",Toast.LENGTH_LONG).show();
        escritura.close();
    }

    public Cursor consultar (int id){
        SQLiteDatabase lectura = getReadableDatabase();
        String consulta = "SELECT nombre, apellido,edad from alumno where id = "+id+"";
        Cursor c = lectura.rawQuery(consulta,null);
        return  c;
    }
}
package com.example.contactos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity<button> extends AppCompatActivity {

    // Definicion de las variables

    private ListView lista;
    private Button agregar;
    private ArrayList list1;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creacion de las variables

       lista = (ListView) findViewById(R.id.listaDeContactos);
       agregar = (Button) findViewById(R.id.button);
       list1 = new ArrayList<String>();
       adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_spinner_item);


    }
}

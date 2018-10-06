package com.example.eduardo.control_estudiantes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaEstudiantesActivity extends AppCompatActivity {
    private ListView lstEstudiantes;
    private EstudianteAdapter adaptadorEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        lstEstudiantes = (ListView) findViewById(R.id.lstEstudiantes);

        //Se inicia el Array List y el adaptador
        adaptadorEstudiante = new EstudianteAdapter(ListaEstudiantesActivity.this, MainActivity.lstEstudiantes);

        //Configurando adaptador
        lstEstudiantes.setAdapter(adaptadorEstudiante);
    }
}


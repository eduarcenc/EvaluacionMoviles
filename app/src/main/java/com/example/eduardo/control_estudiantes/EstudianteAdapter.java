package com.example.eduardo.control_estudiantes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by eduardo on 10-05-18.
 */


public class EstudianteAdapter extends ArrayAdapter<Estudiante> {
    //TODO constructor con 2 parametros : el contexto y la lista de objetos (Contacto)
    public EstudianteAdapter(Context context, List<Estudiante> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Se Obti. el datos
        Estudiante estudiante = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante, parent, false);
        }

        TextView lblNumero = (TextView) convertView.findViewById(R.id.lblNumero);
        TextView lblNombre = (TextView) convertView.findViewById(R.id.lblNombre);
        TextView lblCodigo = (TextView) convertView.findViewById(R.id.lblCodigo);
        TextView lblMateria = (TextView) convertView.findViewById(R.id.lblMateria);
        // mostrar los datos
        String correlativo = Integer.toString(position + 1);
        lblNumero.setText(correlativo);
        lblNombre.setText(estudiante.getNombre());
        lblCodigo.setText(estudiante.getCodigo());
        lblMateria.setText(estudiante.getMateria() + ": " + estudiante.getPromedio());
        // Return la convertView ya con los datos
        return convertView;
    }
}

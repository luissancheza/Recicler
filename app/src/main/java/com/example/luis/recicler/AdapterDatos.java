package com.example.luis.recicler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luis on 27/04/2018.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>{//Creamos esta linea y de ahi crear la clase, crear metodos y resolver errores
    ArrayList<String> listDatos;//crear un constructor para crear la referencia

    public AdapterDatos(ArrayList<String> listDatos) {//constructor de la referencia array
        this.listDatos = listDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {//el objetivo de este metodo es el de enlazar el adaptador con el item_list.xml
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list,null,false);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.asignarDatos(listDatos.get(position));
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView dato;

        public ViewHolderDatos(View itemView) {
            super(itemView);
            dato = (TextView) itemView.findViewById(R.id.idDato);
        }

        public void asignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}

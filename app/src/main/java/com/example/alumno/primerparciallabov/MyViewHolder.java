package com.example.alumno.primerparciallabov;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


/**
 * Created by alumno on 11/10/2018.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {


   public TextView txtcantidad;
    public TextView txtprecio;

    public MyViewHolder(View itemView) {
        super(itemView);
        this.txtcantidad =(TextView) itemView.findViewById(R.id.txtCantidad);
        this.txtprecio =(TextView) itemView.findViewById(R.id.txtprecio);

    }



}

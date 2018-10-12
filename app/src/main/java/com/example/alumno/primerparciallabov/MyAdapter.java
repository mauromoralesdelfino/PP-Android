package com.example.alumno.primerparciallabov;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by alumno on 11/10/2018.
 */


public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        MyViewHolder h = new MyViewHolder(v);
        return h;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Producto p = this.lista.get(position);

        holder.txtprecio.setText(p.getPrecio());
        holder.txtcantidad.setText(p.getCantidad());


    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }

    private List<Producto> lista;

    public MyAdapter(List<Producto> lista) {
        this.lista = lista;
    }
}

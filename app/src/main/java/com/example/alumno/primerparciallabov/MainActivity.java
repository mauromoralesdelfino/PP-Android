package com.example.alumno.primerparciallabov;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.lang.*;
import java.util.concurrent.ExecutionException;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements Handler.Callback {

    Handler h;
    URL url;
    TextView tv;
    RecyclerView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //url = new URL("192.168.2.231:8080/Prodcutos.xml");
        h=new Handler(this);
        Worker w = new Worker(h,"http://192.168.2.231:8080/Productos.xml",false);
        Thread hilo = new Thread(w);
        hilo.start();

        List<Producto> p = new ArrayList<>();
        p.add(new Producto("a","b","c","d"));
        p.add(new Producto("a","b","c","d"));
        p.add(new Producto("a","b","c","d"));
        p.add(new Producto("a","b","a","b"));
        p.add(new Producto("a","b","c","d"));
        p.add(new Producto("a","b","c","d"));
        p.add(new Producto("a","b","c","d"));
        p.add(new Producto("a","b","c","d"));
        p.add(new Producto("a","b","c","d"));
        p.add(new Producto("a","b","c","d"));

        tv = (TextView) findViewById(R.id.txtprecio);
         lista = (RecyclerView) findViewById(R.id.listaRV);
        LinearLayoutManager linear = new LinearLayoutManager(this);
        lista.setLayoutManager(linear);
        MyAdapter adapter = new MyAdapter(p);
        lista.setAdapter(adapter);


    }

    @Override
    public boolean handleMessage(Message msg) {


        List<Producto> p = (List<Producto>) msg.obj;
        MyAdapter adapter = new MyAdapter(p);
        lista.setAdapter(adapter);
        //tv.setText(p.get(10).toString());

        return false;
    }
}

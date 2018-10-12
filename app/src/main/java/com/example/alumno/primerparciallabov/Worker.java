package com.example.alumno.primerparciallabov;

import android.os.Handler;
import android.os.Message;
import android.text.BoringLayout;
import android.util.Log;

import java.net.URL;

/**
 * Created by alumno on 11/10/2018.
 */

public class Worker extends Thread {

    Handler h;
    URL url;
    Boolean bool;
    String conex;

    public Worker(Handler h, String url, Boolean bool)
    {
        this.h =h;
        this.conex = url;
        this.bool=bool;

    }

    @Override
    public void run() {


        Log.d("Hola","Worker" + this.conex.toString());

        try {
            Conexion c = new Conexion();
            HttpConection z = new HttpConection("GET");

            Thread.sleep(4000);
            Message m = new Message();
            m.obj = ParseProductoXML.Listar(z.getStringData(conex));
            h.sendMessage(m);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

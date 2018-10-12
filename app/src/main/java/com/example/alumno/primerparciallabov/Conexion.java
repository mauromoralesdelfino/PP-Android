package com.example.alumno.primerparciallabov;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.lang.*;
import java.util.concurrent.ExecutionException;

/**
 * Created by alumno on 11/10/2018.
 */

public class Conexion extends Thread {

   /* public String MiMetodo()
    {
        String s = "";

        try{


            URL url = new URL("192.168.2.231:8080/Prodcutos.xml");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.connect();
            int response = con.getResponseCode();
            if (response == 200) {
                InputStream is = con.getInputStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int length = 0;
                while (length = isread(buffer) != -1) {
                    baos.write(buffer, 0, length);

                }
                is.close();
                return new String(baos.toByteArray());
            }



        }

        catch (Exception ec)
        {
            ec.printStackTrace();
        }
      return  s;
    }*/




}

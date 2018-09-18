package com.example.a1107515735.tcpclient;

import android.util.Log;

import java.io.IOException;
import java.net.Socket;

public class Cliente extends Thread{

    @Override
    public void run() {
        // Entablar una conexion con el servidor de eclipse llamado servidor

        try {
            Socket s = new Socket("10.0.2.2",5000);// IP solo para cuando usas el emulador en el mismo pc
            Log.e("DEBUG","Holi");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

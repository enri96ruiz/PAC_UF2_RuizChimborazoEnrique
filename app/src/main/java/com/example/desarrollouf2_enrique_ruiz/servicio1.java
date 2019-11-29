package com.example.desarrollouf2_enrique_ruiz;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import static android.content.ContentValues.TAG;

public class servicio1 extends Service {
    public servicio1() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        try {
            Thread.sleep(150000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return super.onStartCommand(intent, flags, startId);
    }
}

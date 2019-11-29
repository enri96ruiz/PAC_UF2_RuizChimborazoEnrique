package com.example.desarrollouf2_enrique_ruiz;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class servicio extends Service {
    private MediaPlayer reproductor;
    @Override
    public void onDestroy() {
        Toast.makeText(this,"Música parada",Toast.LENGTH_LONG).show();
        if(reproductor!=null)
            reproductor.release();
        stopSelf();
        super.onDestroy();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        reproductor = MediaPlayer.create(this,R.raw.ac);
        reproductor.setLooping(true);
        reproductor.start();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

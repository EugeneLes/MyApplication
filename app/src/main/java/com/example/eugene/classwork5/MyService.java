package com.example.eugene.classwork5;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Eugene on 02.08.2017.
 */

public class MyService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("SSS","onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.e("SSS","onStartCommand");
        return super.onStartCommand(intent, flags, startId);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("SSS","onBind");
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.e("SSS","onUnBind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.e("SSS","onDestroy");
        super.onDestroy();
    }
}

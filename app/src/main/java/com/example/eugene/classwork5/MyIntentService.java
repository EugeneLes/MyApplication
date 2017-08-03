package com.example.eugene.classwork5;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;

/**
 * Created by Eugene on 02.08.2017.
 */

public class MyIntentService extends IntentService {
    public static final String KEY_ACTION = "KEY_ACTION";
    public static final String MY_ACTION = "com.example.eugene.classwork5.MY_ACTION";
    public MyIntentService() {
        super("myIntententService_name");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        String action = intent.getStringExtra(KEY_ACTION);

        Log.e("ISSS","onHandleIntent action = "+action);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent intentReceiver = new Intent(MY_ACTION);

        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(this);//for local use only
        localBroadcastManager.sendBroadcast(intentReceiver);

        sendBroadcast(intentReceiver);

    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}

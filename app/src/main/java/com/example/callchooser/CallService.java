package com.example.callchooser;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

public class CallService extends Service {
    private TelephonyManager telephonyManager;
    private PhoneStateListener phoneListener;

    @Override
    public IBinder onBind(Intent intent) { return null; }

    @Override
    public void onCreate() {
        super.onCreate();
        telephonyManager = (TelephonyManager) getSystemService(TELEPHONY_SERVICE);
        phoneListener = new PhoneStateListener() {
            @Override
            public void onCallStateChanged(int state, String number) {
                // Логика обработки звонка
            }
        };
        telephonyManager.listen(phoneListener, PhoneStateListener.LISTEN_CALL_STATE);
    }
}

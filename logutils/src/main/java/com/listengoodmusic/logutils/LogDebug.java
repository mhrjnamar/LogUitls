package com.listengoodmusic.logutils;

import android.util.Log;

/**
 * Created by User on 2/3/2018.
 */

public class LogDebug {
    private static final String TAG = "LogDebug";

    public static void d(String message){
        Log.d(TAG, message);
    }
}

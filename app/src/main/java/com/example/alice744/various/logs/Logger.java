package com.example.alice744.various.logs;

import android.util.Log;

public class Logger {
    private static final String TAG = "MainActivity";

    public void log(String massage) {
        Log.d(TAG, massage);
    }

    public void error(String massage) {
        Log.e(TAG, massage);
    }

    public void info(String massage) {
        Log.i(TAG, massage);
    }
}

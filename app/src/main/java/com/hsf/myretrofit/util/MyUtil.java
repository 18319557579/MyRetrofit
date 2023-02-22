package com.hsf.myretrofit.util;

import android.util.Log;

public class MyUtil {
    public static void largeLog(String tag, String content) {
        if (content.length() > 2000) {
            Log.d(tag, content.substring(0, 2000));
            largeLog(tag, content.substring(2000));
        } else {
            Log.d(tag, content);
        }
    }
}

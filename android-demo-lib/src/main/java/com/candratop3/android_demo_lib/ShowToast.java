package com.candratop3.android_demo_lib;

import android.content.Context;
import android.widget.Toast;

public class ShowToast {
    public static void superToast(Context context, String msg) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

}
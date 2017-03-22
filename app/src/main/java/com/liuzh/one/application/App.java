package com.liuzh.one.application;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

/**
 * application
 * Created by 刘晓彬 on 2017/3/16.
 */

public class App extends Application {

    private static Context mContext;
    private static Toast toast;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }

    /**
     * 弹吐司
     *
     * @param msg 吐司内容
     */
    public static void showToast(String msg) {
        if (toast == null) {
            toast = Toast.makeText(mContext, msg, Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}

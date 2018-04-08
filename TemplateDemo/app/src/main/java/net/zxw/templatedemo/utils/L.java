package net.zxw.templatedemo.utils;

import android.util.Log;

/**
 * @author zxw
 * @Email 18316275391@163.com
 */

public class L {
    //开关
    public static final  boolean DEBUG = true;
    //TAG
    public static final String TAG = "NewSmartbutler";

    //五个等级  DIWE

    public static void d(String text){
        if(DEBUG){
            Log.d(TAG,text);
        }
    }

    public static void i(String text){
        if(DEBUG){
            Log.i(TAG,text);
        }
    }

    public static void w(String text){
        if(DEBUG){
            Log.w(TAG,text);
        }
    }

    public static void e(String text){
        if(DEBUG){
            Log.e(TAG,text);
        }
    }
}

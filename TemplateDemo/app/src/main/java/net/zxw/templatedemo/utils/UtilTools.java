package net.zxw.templatedemo.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * @author zxw
 * @Email 18316275391@163.com
 * @describe 工具类
 */

public class UtilTools {
    //设置字体
    public static void setFont(Context mContext, TextView textview){
        Typeface fontType = Typeface.createFromAsset(mContext.getAssets(),"fonts/FONT.TTF");
        textview.setTypeface(fontType);
    }
}

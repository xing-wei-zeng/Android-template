package net.zxw.templatedemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import net.zxw.templatedemo.MainActivity;
import net.zxw.templatedemo.R;
import net.zxw.templatedemo.utils.ShareUtils;
import net.zxw.templatedemo.utils.StaticClass;
import net.zxw.templatedemo.utils.UtilTools;

/**
 * @author zxw
 * @Email 18316275391@163.com
 * @describe 闪屏页
 */

public class SplashActivity extends AppCompatActivity{
    /**
     * 1.延时2000ms
     * 2.判断程序是否第一次运行
     * 3.自定义字体
     * 4.Activity全屏主题
     */

    private TextView tv_splash;

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case StaticClass.HANDLER_SPLASH:
                    if(isFirst()){
                        startActivity(new Intent(SplashActivity.this,GuideActivity.class));
                    }else{
                        startActivity(new Intent(SplashActivity.this,MainActivity.class));
                    }
                    finish();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        initView();
    }
    //初始化View
    private void initView() {
        //延时2000ms
        handler.sendEmptyMessageDelayed(StaticClass.HANDLER_SPLASH,2000);
        tv_splash = (TextView)findViewById(R.id.tv_splash);
        //设置字体
        UtilTools.setFont(this,tv_splash);
    }
    //判断程序是否第一次运行
    private boolean isFirst(){
        boolean isFirst =  ShareUtils.getBoolean(this,StaticClass.SHARE_IS_FIRST,true);
            if(isFirst){
                //标记我们已经启动过app
                ShareUtils.putBoolean(this,StaticClass.SHARE_IS_FIRST,false);
                return true;
            }else {
                return false;
            }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

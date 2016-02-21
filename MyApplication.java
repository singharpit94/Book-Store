package com.example.arpit.book_store;
import android.app.Application;
import android.content.Context;

/**
 * Created by raj on 2/1/16.
 */
public class MyApplication extends Application {
    private static MyApplication myApplication=null;
    @Override
    public void onCreate(){
        super.onCreate();
        myApplication=this;
    }
    public static  MyApplication getInstance(){
        return myApplication;
    }
    public static Context getAppContext(){
        return myApplication.getApplicationContext();
    }
}
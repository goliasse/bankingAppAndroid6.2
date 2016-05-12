package cput.ac.za.bankingapp.conf.database;

import android.app.Application;
import android.content.Context;

/**
 * Created by Scorpian on 2016-05-12.
 */
public class App extends Application {

    private static Context context;
    private static App singleton;

    public void onCreate()
    {
        super.onCreate();
        App.context =getApplicationContext();
        singleton = this;
    }


    public static Context getAppContext()
    {
        return App.context;
    }



}

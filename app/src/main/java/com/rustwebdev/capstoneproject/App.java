package com.rustwebdev.capstoneproject;

import android.app.Application;

import com.rustwebdev.capstoneproject.inject.*;

public class App extends Application {
    public App() {
        Injector.init(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.getAppComponent().inject(this);
    }
}

package com.rustwebdev.capstoneproject.inject;

import android.app.*;

public class Injector {
    private static AppComponent appComponent = null;

    public static void init(Application app){
        if(appComponent == null){
            appComponent = DaggerAppComponent.builder().appModule(new AppModule(app)).build();
        }
    }

    public static AppComponent getAppComponent() {
        if(appComponent != null) {
            return appComponent;
        } else {
            throw new IllegalStateException("AppComponent is null. Call init() prior to calling getAppComponent");
        }
    }
}

package com.rustwebdev.capstoneproject.inject;

import android.app.*;

import javax.inject.*;

import dagger.*;

@Module
public class AppModule {
    private Application application;
    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    private static Application provideApplication() {
        return provideApplication();
    }
}

package com.rustwebdev.capstoneproject.inject;

import android.app.*;

import com.rustwebdev.capstoneproject.*;
import com.rustwebdev.capstoneproject.ui.main.*;
import com.rustwebdev.capstoneproject.ux.*;

import javax.inject.*;

import dagger.*;

@Singleton
@Component(modules = {AppModule.class, ViewModelModule.class})
public interface AppComponent {

    App app();

    MainActivity mainActivity();

    void inject(App application);


}

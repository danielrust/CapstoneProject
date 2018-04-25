package com.rustwebdev.capstoneproject.ui.main;

import android.arch.lifecycle.*;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.rustwebdev.capstoneproject.*;
import com.rustwebdev.capstoneproject.R;

public class MainActivity extends AppCompatActivity {

    MainViewModel createViewModel() {
        return ViewModelProviders.of(this).get(MainViewModel.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

package com.mobile.bitstro.bitstroapp;

import android.app.Application;

import com.google.firebase.FirebaseApp;
import com.mobile.bitstro.bitstroapp.di.components.ApplicationComponent;
import com.mobile.bitstro.bitstroapp.di.components.DaggerApplicationComponent;
import com.mobile.bitstro.bitstroapp.di.modules.ApplicationModule;

/**
 * Created by natalyablanco on 27/02/2017.
 */

public class BitstroApplication extends Application {
    private ApplicationComponent applicationComponent;

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
      //  FirebaseApp.initializeApp(getBaseContext());
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
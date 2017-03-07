package com.mobile.bitstro.bitstroapp.di.components;


import com.mobile.bitstro.bitstroapp.RecommendationActivity;
import com.mobile.bitstro.bitstroapp.di.modules.ApiModule;
import com.mobile.bitstro.bitstroapp.di.modules.ApplicationModule;
import com.mobile.bitstro.bitstroapp.di.modules.AuthenticationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {

    void inject(RecommendationActivity recommendationActivity);
    AuthenticationComponent plus(AuthenticationModule authenticationModule);
}

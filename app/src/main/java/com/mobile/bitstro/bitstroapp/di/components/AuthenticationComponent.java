package com.mobile.bitstro.bitstroapp.di.components;

import com.mobile.bitstro.bitstroapp.authentication.AuthenticationActivity;
import com.mobile.bitstro.bitstroapp.di.modules.AuthenticationModule;

import dagger.Subcomponent;

/**
 * Created by natalyablanco on 27/02/2017.
 */


@Subcomponent(modules = {AuthenticationModule.class})
public interface AuthenticationComponent {

    void inject(AuthenticationActivity authenticationActivity);
}


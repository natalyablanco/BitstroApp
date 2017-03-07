package com.mobile.bitstro.bitstroapp.authentication;

/**
 * Created by natalyablanco on 06/03/2017.
 */

public class AuthenticationPresenter {
    private static final AuthenticationPresenter ourInstance = new AuthenticationPresenter();

    public static AuthenticationPresenter getInstance() {
        return ourInstance;
    }

    private AuthenticationPresenter() {
    }
}

package com.mobile.bitstro.bitstroapp.authentication;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.mobile.bitstro.bitstroapp.BitstroApplication;
import com.mobile.bitstro.bitstroapp.R;
import com.mobile.bitstro.bitstroapp.di.modules.AuthenticationModule;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * A login screen that offers login via email/password.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class AuthenticationActivity extends AppCompatActivity implements AuthenticationView {

    private static final String TAG = "Login Activity";

    @Bind(R.id.email)
    TextView email;

    @Bind(R.id.password)
    TextView password;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        ((BitstroApplication) getApplicationContext())
                .getApplicationComponent()
                .plus(new AuthenticationModule(this))
                .inject(this);


    }

    @OnClick(R.id.loginbutton)
    void loginUser(){
        //TODO Login
    }


    @Override
    public void handleAuthStateChange() {

    }

    @Override
    public void showSigninButton() {

    }
}








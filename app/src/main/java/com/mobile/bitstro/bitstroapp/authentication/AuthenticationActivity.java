package com.mobile.bitstro.bitstroapp.authentication;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.auth.FirebaseAuth;
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


    private FirebaseAuth firebaAuth;



    private FirebaseAuth.AuthStateListener firebaseAuthListener;


    private CallbackManager mCallbackManager;
    private LoginButton loginButton;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        ((BitstroApplication) getApplicationContext())
                .getApplicationComponent()
                .plus(new AuthenticationModule(this))
                .inject(this);

        LoginButton loginButton = (LoginButton) findViewById(R.id.login_button);


        }

    private void handleFacebookAccessToken(AccessToken accessToken) {

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


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Pass the activity result back to the Facebook SDK
        mCallbackManager.onActivityResult(requestCode, resultCode, data);
    }
}








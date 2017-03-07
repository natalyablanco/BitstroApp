package com.mobile.bitstro.bitstroapp.di.modules;

import android.support.v4.app.FragmentActivity;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;
import com.mobile.bitstro.bitstroapp.R;

import dagger.Module;
import dagger.Provides;

/**
 * Created by natalyablanco on 27/02/2017.
 */

@Module
public class AuthenticationModule {

    private static FragmentActivity fragmentActivity;

    public AuthenticationModule(FragmentActivity activity) {
        this.fragmentActivity = activity;
    }

    @Provides
    public static FirebaseAuth providesFirebaseAuth() {
        return FirebaseAuth.getInstance();
    }

    @Provides
    public static GoogleApiClient providesGoogleApiClient() {
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions
        .DEFAULT_SIGN_IN)
                .requestIdToken(fragmentActivity.getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        return new GoogleApiClient.Builder(fragmentActivity)
                .enableAutoManage(fragmentActivity, connectionResult -> {

                })
                .addApi(Auth.GOOGLE_SIGN_IN_API, gso)
                .build();
    }
}
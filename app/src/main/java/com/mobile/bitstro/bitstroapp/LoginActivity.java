package com.mobile.bitstro.bitstroapp;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.mobile.bitstro.bitstroapp.model.User;
import com.mobile.bitstro.bitstroapp.rest.LoginService;
import com.mobile.bitstro.bitstroapp.rest.ServiceGenerator;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


/**
 * A login screen that offers login via email/password.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class LoginActivity extends AppCompatActivity  {

    // you should either define client id and secret as constants or in string resources
    // this class properties will be defined in the future when the authentication is done
    // via others social networks
    private final String clientId = "natalya";
    private final String clientSecret = "your-client-secret";
    private final String redirectUri = "your://redirecturi";

    @Bind(R.id.email)
    TextView email;

    @Bind(R.id.password)
    TextView password;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);


    }

    @OnClick(R.id.loginbutton)
    void login(){
        // Create a REST adapter which points the GitHub API endpoint.
        LoginService loginService =
                ServiceGenerator.createService(LoginService.class,
                                                email.getText().toString(),
                                                password.getText().toString());

        // Fetch and print the access token
        Log.i("After creating login service ", " ");
        Call<User> call = loginService.basicLogin();

        call.enqueue(new Callback<User>(){


            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                Log.i("ON RESPONSE: ", call.request().toString());
                if (response.isSuccessful()) {
                    // user object available
                    Log.i("ACCESS TOKEN: ",response.body().getToken());
                } else {
                    // error response, no access to resource?
                    Log.e("ERROR response:", "");
                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                // something went completely south (like no internet connection)
                Log.d("Error", t.getMessage());
            }
        });
        //Call<AccessToken> call = loginService.getAccessToken("code", "authorization_code");
       /* call.enqueue(new Callback<AccessToken>() {
                         @Override
                         public void onResponse(Call<AccessToken> call, Response<AccessToken> response) {
                             if (response.isSuccessful()) {
                                 // tasks available
                                 Log.i("Success ", response.body().toString());
                             } else {
                                 // error response, no access to resource?
                                 Log.i("Error response ", String.valueOf(response));
                             }
                         }

                         @Override
                         public void onFailure(Call<AccessToken> call, Throwable t) {
                             // something went completely south (like no internet connection)
                             Log.d("Error", t.getMessage());
                         }
                     });*/
    }

    @Override
    protected void onResume() {
        super.onResume();

 /*       // the intent filter defined in AndroidManifest will handle the return from ACTION_VIEW intent
        Uri uri = getIntent().getData();
        if (uri != null && uri.toString().startsWith(redirectUri)) {
            // use the parameter your API exposes for the code (mostly it's "code")
            String code = uri.getQueryParameter("code");
            if (code != null) {
                // get access token
                LoginService loginService =
                        ServiceGenerator.createService(LoginService.class, clientId, clientSecret);
                Call<AccessToken> call = loginService.getAccessToken(code, "authorization_code");
                try {
                    AccessToken accessToken = call.execute().body();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (uri.getQueryParameter("error") != null) {
                // show an error message here
            }
        }*/
    }


    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }


}








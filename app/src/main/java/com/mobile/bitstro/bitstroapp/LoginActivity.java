package com.mobile.bitstro.bitstroapp;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.mobile.bitstro.bitstroapp.model.AccessToken;
import com.mobile.bitstro.bitstroapp.rest.LoginService;
import com.mobile.bitstro.bitstroapp.rest.ServiceGenerator;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;


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

        LoginService loginService =
                ServiceGenerator.createSeryvice(LoginService.class,
                                                email.getText().toString(),
                                                password.getText().toString());


       /* String username = "sarahjean";
        Call<User> call = apiService.getUser(username);
        call.enqueue(new SortedList.Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                int statusCode = response.code();
                User user = response.body();
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                // Log error here since request failed
            }
        });*/

        Call<AccessToken> call = loginService.getAccessToken("code", "authorization_code");
        try {
            AccessToken accessToken =  call.execute().body();
                /*    call.enqueue(new Callback<AccessToken>() {
                @Override
                public void onResponse(Call<AccessToken> call, Response<AccessToken> response) {
                    int statusCode = response.code();
                    AccessToken user = response.body();
                }

                @Override
                public void onFailure(Call<AccessToken> call, Throwable t) {
                    // Log error here since request failed
                }

            });*/

            Toast.makeText(this, "Login "+accessToken, Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Intent intent = new Intent(
                Intent.ACTION_VIEW,
                Uri.parse(ServiceGenerator.API_BASE_URL + "/users/auth_login/"));
        startActivity(intent);*/
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








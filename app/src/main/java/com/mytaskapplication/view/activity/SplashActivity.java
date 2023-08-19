package com.mytaskapplication.view.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.mytaskapplication.R;
//import com.mytaskapplication.model.helper.MethodClass;
import com.mytaskapplication.model.sharedpreferences.PreferenceFile;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    getPackageName(),
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                Log.e("KeyHash:-", Base64.encodeToString(messageDigest.digest(), Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


        goToNext();
    }

    private void goToNext() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                /*if (PreferenceFile.isLogged()) {
                    //go_to_next_activity(SplashActivity.this, HomeActvity.class);
                    finish();
                } else {*/

                    go_to_next_activity(SplashActivity.this, MainActivity.class);
                    finish();
                //}
            }
        }, 3000);
    }

    public static void go_to_next_activity(Activity activity, Class next_activity) {
        activity.startActivity(new Intent(activity, next_activity));

    }
}

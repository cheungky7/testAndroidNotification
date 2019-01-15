package com.test.testnotification2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.android.gms.tasks.OnCompleteListener;
import android.widget.Toast;
import android.support.annotation.NonNull;
import android.util.Log;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseMessaging.getInstance().subscribeToTopic("news")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {

                      /*  String msg = getString(R.string.msg_subscribed);
                                                if (!task.isSuccessful()) {
                                                    msg = getString(R.string.msg_subscribe_failed);
                                                }
                                                Log.d(TAG, msg);
                                                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                                            */
                        if (!task.isSuccessful()) {
                            Log.d("MainActivity","Subscribe Success");
                        }
                        // Log.d("Subscribe Success");
                    }
                });


    }
}

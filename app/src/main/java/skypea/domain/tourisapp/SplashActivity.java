package skypea.domain.tourisapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Thread thread = new Thread() {

           public void run() {
               try {
                   sleep(3000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               } finally {
                   startActivity(new Intent(SplashActivity.this, MainActivity.class));
               }

           }

        };

        thread.start();
    }


}

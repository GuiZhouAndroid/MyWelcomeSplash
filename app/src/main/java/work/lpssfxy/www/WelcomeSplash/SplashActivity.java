package work.lpssfxy.www.WelcomeSplash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

/**
 * created by on 2021/8/15
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-08-15-18:19
 */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {
                        finish();
                    }
                }, 300);
            }
        }, 500);
    }
}


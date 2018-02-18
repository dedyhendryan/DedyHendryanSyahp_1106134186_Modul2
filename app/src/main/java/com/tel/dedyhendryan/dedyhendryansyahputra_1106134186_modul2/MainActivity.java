package com.tel.dedyhendryan.dedyhendryansyahputra_1106134186_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static  int splashInterval =3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, MenuUtama.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "DedyHendryanSyahputra_1106134186", Toast.LENGTH_LONG).show();
                this.finish();
            }
            private void finish() {

            }
        }, splashInterval);
    }
}


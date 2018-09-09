package com.inflearn.lightinstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    private TextView txtSplash;
    private Button btnSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        findView();
        setButton();
    }

    private void findView() {
        txtSplash = findViewById(R.id.txt_splash);
        btnSplash = findViewById(R.id.btn_splash);
    }

    private void setButton() {
        final String welcome = getString(R.string.splash_welcome);
        final String happy = getString(R.string.splash_happy);

        btnSplash.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = txtSplash.getText().toString();
                if (text.equals(welcome)) {
                    txtSplash.setText(R.string.splash_happy);
                } else if (text.equals(happy)) {
                    txtSplash.setText(R.string.splash_welcome);
                }
            }
        });
    }
}
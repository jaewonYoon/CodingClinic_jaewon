package com.inflearn.lightinstagram.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.inflearn.lightinstagram.R;
import com.inflearn.lightinstagram.ui.base.BaseActivity;

public class SplashActivity extends BaseActivity {

    private Button btnSplash;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        findView();
        setButton();
    }

    private void findView() {
        btnSplash = findViewById(R.id.btn_splash);
    }

    private void setButton() {
        btnSplash.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class)
                        .putExtra(MainActivity.NAME_KEY, "maryang");
                startActivity(intent);
                finish();
            }
        });
    }
}
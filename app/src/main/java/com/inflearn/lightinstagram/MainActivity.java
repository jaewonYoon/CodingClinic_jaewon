package com.inflearn.lightinstagram;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    public static final String NAME_KEY = "NAME_KEY";
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        findView();
        setArguments();
    }

    private void findView() {
        txtName = findViewById(R.id.txt_name);
    }

    private void setArguments() {
        txtName.setText(getIntent().getStringExtra(NAME_KEY));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
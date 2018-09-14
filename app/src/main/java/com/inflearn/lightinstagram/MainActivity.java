package com.inflearn.lightinstagram;

import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends BaseActivity {

    public static final String NAME_KEY = "NAME_KEY";
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        setArguments();
        setFragment();
    }

    private void setArguments() {
        name = getIntent().getStringExtra(NAME_KEY);
    }

    private void setFragment() {
        MainFragment fragment = MainFragment.newInstance(name);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.box_fragment, fragment);
        transaction.commit();
    }
}
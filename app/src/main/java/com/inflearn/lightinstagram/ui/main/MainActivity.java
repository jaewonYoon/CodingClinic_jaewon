package com.inflearn.lightinstagram.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.inflearn.lightinstagram.R;
import com.inflearn.lightinstagram.ui.base.BaseActivity;
import com.inflearn.lightinstagram.ui.feed.FeedFragment;
import com.inflearn.lightinstagram.ui.noti.NotiFragment;
import com.inflearn.lightinstagram.ui.profile.ProfileFragment;
import com.inflearn.lightinstagram.ui.upload.UploadActivity;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends BaseActivity {

    public static final String NAME_KEY = "NAME_KEY";
    private String name;

    private Fragment feedFragment;
    private Fragment notiFragment;
    private Fragment profileFragment;
    private Fragment activeFragment;
    private final FragmentManager fm = getSupportFragmentManager();

    private BottomNavigationView bottomNavigationView;
    private int selectedItemId;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setArguments();
        initializeFragments();

        findView();
        setBottomNavigationView();

        bottomNavigationView.setSelectedItemId(R.id.nav_bottom_feed);
    }

    private void setArguments() {
        name = getIntent().getStringExtra(NAME_KEY);
    }

    private void initializeFragments() {
        feedFragment = new FeedFragment();
        notiFragment = new NotiFragment();
        profileFragment = ProfileFragment.newInstance(name);

        fm.beginTransaction().add(R.id.box_fragment, feedFragment).hide(feedFragment)
                .add(R.id.box_fragment, notiFragment).hide(notiFragment)
                .add(R.id.box_fragment, profileFragment).hide(profileFragment)
                .commit();
    }

    private void findView() {
        bottomNavigationView = findViewById(R.id.nav_bottom);
    }

    private void setBottomNavigationView() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.nav_bottom_feed:
                        setFragment(feedFragment, id);
                        return true;
                    case R.id.nav_bottom_upload:
                        startActivity(new Intent(context, UploadActivity.class));
                        bottomNavigationView.post(new Runnable() {
                            @Override
                            public void run() {
                                bottomNavigationView.setSelectedItemId(selectedItemId);
                            }
                        });
                        return true;
                    case R.id.nav_bottom_noti:
                        setFragment(notiFragment, id);
                        return true;
                    case R.id.nav_bottom_profile:
                        setFragment(profileFragment, id);
                        return true;
                }
                return false;
            }
        });
    }

    private void setFragment(Fragment fragment, int id) {
        selectedItemId = id;
        if (fragment == activeFragment) return;
        FragmentTransaction transaction = fm.beginTransaction();
        if (activeFragment != null) transaction.hide(activeFragment);
        transaction.show(fragment)
                .commit();
        activeFragment = fragment;
    }
}
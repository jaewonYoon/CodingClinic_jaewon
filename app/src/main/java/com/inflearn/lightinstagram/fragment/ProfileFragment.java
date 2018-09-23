package com.inflearn.lightinstagram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.inflearn.lightinstagram.BaseFragment;
import com.inflearn.lightinstagram.R;
import com.inflearn.lightinstagram.activity.MainActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ProfileFragment extends BaseFragment {

    private TextView txtName;

    public static ProfileFragment newInstance(String name) {
        Bundle args = new Bundle();
        args.putString(MainActivity.NAME_KEY, name);

        ProfileFragment fragment = new ProfileFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        findView(view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setArguments();
    }

    private void findView(View view) {
        txtName = view.findViewById(R.id.txt_name);
    }

    private void setArguments() {
        String name = getArguments().getString(MainActivity.NAME_KEY);
        txtName.setText(getString(R.string.profile_welcome) + ": " + name);
    }
}
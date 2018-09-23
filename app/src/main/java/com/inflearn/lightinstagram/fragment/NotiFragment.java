package com.inflearn.lightinstagram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inflearn.lightinstagram.BaseFragment;
import com.inflearn.lightinstagram.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

public class NotiFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_noti, container, false);
    }

    @Override
    protected void initializeToolbar(Toolbar toolbar) {
        super.initializeToolbar(toolbar);
        toolbar.setTitle(R.string.noti_title);
    }
}
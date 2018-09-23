package com.inflearn.lightinstagram.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.inflearn.lightinstagram.BaseFragment;
import com.inflearn.lightinstagram.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;

public class FeedFragment extends BaseFragment {

    private LinearLayout boxScrollView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_feed, container, false);
        findView(view);
        return view;
    }

    @Override
    protected void initializeToolbar(Toolbar toolbar) {
        super.initializeToolbar(toolbar);
        toolbar.setTitle(R.string.feed_title);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setScrollView();
    }

    private void findView(View view) {
        boxScrollView = view.findViewById(R.id.box_scrollview);
    }

    private void setScrollView() {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.feed3);
        boxScrollView.addView(imageView);

        imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.feed4);
        boxScrollView.addView(imageView);

        imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.feed5);
        boxScrollView.addView(imageView);
    }
}
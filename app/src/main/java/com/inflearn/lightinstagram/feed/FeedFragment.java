package com.inflearn.lightinstagram.feed;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inflearn.lightinstagram.BaseFragment;
import com.inflearn.lightinstagram.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FeedFragment extends BaseFragment {

    private RecyclerView recyclerView;
    private FeedAdapter adapter;

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
        setRecyclerView();
        setItems();
    }

    private void findView(View view) {
        recyclerView = view.findViewById(R.id.recyclerview);
    }

    private void setRecyclerView() {
        adapter = new FeedAdapter();
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapter);
    }

    private void setItems() {
        List<Integer> imageIds = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            imageIds.add(R.drawable.feed1);
            imageIds.add(R.drawable.feed2);
            imageIds.add(R.drawable.feed3);
            imageIds.add(R.drawable.feed4);
            imageIds.add(R.drawable.feed5);
        }
        adapter.addAll(imageIds);
    }
}
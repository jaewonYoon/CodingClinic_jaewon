package com.inflearn.lightinstagram.feed;

import android.view.ViewGroup;

import com.inflearn.lightinstagram.BaseRecyclerViewAdapter;
import com.inflearn.lightinstagram.BaseViewHolder;

public class FeedAdapter extends BaseRecyclerViewAdapter {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected BaseViewHolder getViewHolder(int viewType, ViewGroup parent) {
        return new FeedItemViewHolder(parent);
    }
}
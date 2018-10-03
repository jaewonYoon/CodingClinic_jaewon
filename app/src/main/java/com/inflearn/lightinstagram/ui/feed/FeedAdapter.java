package com.inflearn.lightinstagram.ui.feed;

import android.view.ViewGroup;

import com.inflearn.lightinstagram.ui.base.BaseRecyclerViewAdapter;
import com.inflearn.lightinstagram.ui.base.BaseViewHolder;

public class FeedAdapter extends BaseRecyclerViewAdapter {

    private final String TAG = getClass().getSimpleName();

    @Override
    protected BaseViewHolder getViewHolder(int viewType, ViewGroup parent) {
        return new FeedItemViewHolder(parent);
    }
}
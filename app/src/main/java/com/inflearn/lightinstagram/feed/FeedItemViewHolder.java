package com.inflearn.lightinstagram.feed;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.inflearn.lightinstagram.BaseViewHolder;
import com.inflearn.lightinstagram.R;

import androidx.annotation.NonNull;

public class FeedItemViewHolder extends BaseViewHolder<Integer> {

    private ImageView imageView;

    public FeedItemViewHolder(@NonNull ViewGroup parent) {
        super(getItemView(parent, R.layout.view_feed_item));
        findView(itemView);
    }

    private void findView(View view) {
        imageView = view.findViewById(R.id.img_feed);
    }

    @Override
    public void bind(Integer item) {
        imageView.setImageResource(item);
    }
}
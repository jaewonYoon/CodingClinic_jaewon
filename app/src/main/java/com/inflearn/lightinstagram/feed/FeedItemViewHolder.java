package com.inflearn.lightinstagram.feed;

import android.view.View;
import android.widget.ImageView;

import com.inflearn.lightinstagram.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FeedItemViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;

    public FeedItemViewHolder(@NonNull View itemView) {
        super(itemView);
        findView(itemView);
    }

    private void findView(View view) {
        imageView = view.findViewById(R.id.img_feed);
    }

    public void bind(int id) {
        imageView.setImageResource(id);
    }
}
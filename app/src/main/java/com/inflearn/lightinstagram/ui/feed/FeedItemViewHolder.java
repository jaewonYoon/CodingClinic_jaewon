package com.inflearn.lightinstagram.ui.feed;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.inflearn.lightinstagram.R;
import com.inflearn.lightinstagram.data.entity.User;
import com.inflearn.lightinstagram.ui.base.BaseViewHolder;

import androidx.annotation.NonNull;

public class FeedItemViewHolder extends BaseViewHolder<User> implements View.OnClickListener {

    private ImageView imgAvatar;
    private TextView txtName;

    private User user;

    public FeedItemViewHolder(@NonNull ViewGroup parent) {
        super(getItemView(parent, R.layout.view_feed_item));
        findView(itemView);
    }

    private void findView(View view) {
        imgAvatar = view.findViewById(R.id.img_avatar);
        txtName = view.findViewById(R.id.txt_name);
    }

    @Override
    public void bind(final User user) {
        this.user = user;
        txtName.setText(user.getName());
        itemView.setOnClickListener(this);

        Glide.with(context)
                .load(user.getAvatarUrl())
                .into(imgAvatar);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(user.getUrl()));
        context.startActivity(intent);
    }
}
package com.inflearn.lightinstagram.data.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class Feed {

    private long id;

    private User user;

    private String text;

    private String imageUrl;

    @SerializedName("like_count")
    private int likeCount;

    @SerializedName("reply_count")
    private int replyCount;

    @SerializedName("sub_replies")
    private List<Reply> subReplies;

    @SerializedName("created_at")
    private Date createdAt;

    @SerializedName("updated_at")
    private Date updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(int replyCount) {
        this.replyCount = replyCount;
    }

    public List<Reply> getSubReplies() {
        return subReplies;
    }

    public void setSubReplies(List<Reply> subReplies) {
        this.subReplies = subReplies;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
package com.google.proxy;


import com.google.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}

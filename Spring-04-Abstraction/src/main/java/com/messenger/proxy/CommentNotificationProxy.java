package com.messenger.proxy;

import com.messenger.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}

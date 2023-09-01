package com.messenger.proxy;

import com.messenger.model.Comment;

public class AndroidPushCommentNotification implements CommentNotificationProxy {
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending ANDROID push notification command: " + comment);
    }
}

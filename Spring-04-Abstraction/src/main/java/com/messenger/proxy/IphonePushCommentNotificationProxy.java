package com.messenger.proxy;

import com.messenger.model.Comment;

public class IphonePushCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending IPHONE push notification command: "+comment);
    }
}

package com.messenger.proxy;

import com.messenger.model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending EMAIl notification command: "+comment);
    }
}

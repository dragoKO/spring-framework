package com.messenger.proxy;

import com.messenger.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // this class dependency itself
@Primary
public class EmailCommentNotificationProxy implements CommentNotificationProxy{
    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending EMAIl notification command: "+comment);
    }
}

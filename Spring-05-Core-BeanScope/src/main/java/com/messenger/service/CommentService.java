package com.messenger.service;

import com.messenger.model.Comment;
import com.messenger.proxy.CommentNotificationProxy;
import com.messenger.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // this class has dependency

public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService( @Qualifier("PostgreSQL")CommentRepository commentRepository,@Qualifier("androidPushCommentNotification") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}

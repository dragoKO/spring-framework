package com.messenger.service;

import com.messenger.model.Comment;
import com.messenger.proxy.CommentNotificationProxy;
import com.messenger.repositiry.CommentRepository;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}

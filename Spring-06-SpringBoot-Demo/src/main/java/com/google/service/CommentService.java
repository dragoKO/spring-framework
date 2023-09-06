package com.google.service;


import com.google.model.Comment;
import com.google.proxy.CommentNotificationProxy;
import com.google.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component // this class has dependency

public class CommentService {
    @Value("${operationSystem}")
    private String operationSystem;
    @Value("${windowsSpecifications}")
    private String[] windowsSpecifications;

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(@Qualifier("PostgreSQL")CommentRepository commentRepository, @Qualifier("androidPushCommentNotification") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
    public void operationSystemPrinter(){
        System.out.println(operationSystem);
    }

    public void windowsSpecificationsPrinter(){
        Arrays.stream(windowsSpecifications).forEach(System.out::println);
    }

}

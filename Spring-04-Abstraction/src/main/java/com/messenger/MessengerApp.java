package com.messenger;

import com.messenger.configuration.ProjectConfig;
import com.messenger.model.Comment;
import com.messenger.service.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MessengerApp {
    public static void main(String[] args) {
        Comment comment = new Comment("Bill Gates", "Hi! Microsoft!");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService commentService = applicationContext.getBean(CommentService.class);
        commentService.publishComment(comment);
        System.out.println("===========================================");

    }
}

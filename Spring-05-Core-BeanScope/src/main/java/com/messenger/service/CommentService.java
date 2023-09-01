package com.messenger.service;

import com.messenger.model.Comment;
import com.messenger.proxy.CommentNotificationProxy;
import com.messenger.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // this class has dependency
//@Scope("prototype")
//@Scope(BeanDefinition.SCOPE_PROTOTYPE)
//@Lazy // lazy instantiation by default it eager. Lazy -> crete object when call it only.
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentService(@Qualifier("PostgreSQL") CommentRepository commentRepository, @Qualifier("androidPushCommentNotification") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
        System.out.println("Comment service created");
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}

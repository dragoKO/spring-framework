package com.messenger.repository;

import com.messenger.model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component // this class dependency itself
@Primary
public class OracleDBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store comment in ORACLE database: " + comment);
    }
}

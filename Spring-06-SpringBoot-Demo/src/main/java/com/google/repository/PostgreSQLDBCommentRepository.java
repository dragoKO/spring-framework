package com.google.repository;


import com.google.model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // this class dependency itself
@Qualifier("PostgreSQL")
public class PostgreSQLDBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store comment in POSTGRES_SQL database: " + comment);
    }
}

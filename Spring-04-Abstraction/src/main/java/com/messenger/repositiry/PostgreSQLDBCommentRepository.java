package com.messenger.repositiry;

import com.messenger.model.Comment;

public class PostgreSQLDBCommentRepository implements CommentRepository{
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store comment in POSTGRES_SQL database: " + comment);
    }
}

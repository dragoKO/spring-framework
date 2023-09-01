package com.messenger.repositiry;

import com.messenger.model.Comment;

public class OracleDBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Store comment in ORACLE database: " + comment);
    }
}

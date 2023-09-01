package com.messenger.repository;

import com.messenger.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

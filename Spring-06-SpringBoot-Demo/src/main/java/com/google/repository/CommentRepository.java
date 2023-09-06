package com.google.repository;


import com.google.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

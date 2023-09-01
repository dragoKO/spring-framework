package com.messenger.repositiry;

import com.messenger.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}

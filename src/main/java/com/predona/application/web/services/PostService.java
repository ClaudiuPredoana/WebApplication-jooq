package com.predona.application.web.services;
import java.sql.Timestamp;
import java.util.ArrayList; import java.util.List;
import org.jooq.DSLContext; import org.jooq.Record;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.predona.application.web.entities.Comment;
import com.predona.application.web.entities.Post;
import static com.predona.application.web.entities.Post.*;
import static com.predona.application.web.entities.Comment.*;


@Service
@Transactional
public class PostService {


    @Autowired
    private DSLContext dsl;

    private Post getPostEntity(Record r) {
        Integer id = r.getValue(POSTS.ID, Integer.class);
        String title = r.getValue(POSTS.TITLE, String.class);
        String content = r.getValue(POSTS.CONTENT, String.class);
    Timestamp createdOn = r.getValue(POSTS.CREATED_ON, Timestamp.class);
    return new Post(id, title, content, createdOn);
    }

    private Comment getCommentEntity(Record r) {
        Integer id = r.getValue(COMMENTS.ID, Integer.class);
        Integer postId = r.getValue(COMMENTS.POST_ID, Integer.class);
        String name = r.getValue(COMMENTS.NAME, String.class);
    }

    String email = r.getValue(COMMENTS.EMAIL, String.class);
    String content = r.getValue(COMMENTS.CONTENT, String.class);
    Timestamp createdOn = r.getValue(COMMENTS.CREATED_ON, Timestamp.class);
    return new Comment(id, postId, name, email, content, createdOn);
}



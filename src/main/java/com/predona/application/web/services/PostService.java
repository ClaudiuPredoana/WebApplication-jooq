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
import static com.predona.application.web.entities.Post.POSTS;
import static com.predona.application.web.entities.Comment.COMMENTS;


@Service
@Transactional
public class PostService {


    @Autowired
    private DSLContext dsl;
}

package com.google;

import com.google.model.Comment;
import com.google.service.CommentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//   conf class @Configuration
@SpringBootApplication // @SpringBootConfiguration + @EnableAutoConfiguration + @ComponentScan
public class GoogleApplication {

    public static void main(String[] args) {
        Comment comment = new Comment("Bill Gates", "Hi! Microsoft!");

        ConfigurableApplicationContext context = SpringApplication.run(GoogleApplication.class, args);

        CommentService commentService = context.getBean(CommentService.class);

        commentService.publishComment(comment);
        commentService.operationSystemPrinter();
        commentService.windowsSpecificationsPrinter();
    }

}

package com.messenger;

import com.messenger.configuration.ProjectConfig;
import com.messenger.model.Comment;
import com.messenger.service.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import java.util.Objects;


public class MessengerApp {
    public static void main(String[] args) {

        Comment comment = new Comment("Bill Gates", "Hi! Microsoft!");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfig.class);


//        CommentService bean_1 = applicationContext.getBean(CommentService.class);
//        CommentService bean_2 = applicationContext.getBean(CommentService.class);
//
//        Objects will be same unless u will add -> @Scope("prototype") or @Scope(BeanDefinition.SCOPE_PROTOTYPE) in Comment service class
//        System.out.println("bean_1 = " + bean_1);
//        System.out.println("bean_2 = " + bean_2);
//        System.out.println(bean_1 == bean_2);
//        System.out.println("===============================================");


    }
}

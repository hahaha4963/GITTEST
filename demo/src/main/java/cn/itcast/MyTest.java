package cn.itcast;

import cn.itcast.application.JavaConfigApplication;
import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MyTest {

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfigApplication.class);

        UserService userService = ctx.getBean(UserService.class);

        System.out.println(userService);

        List<User> users = userService.queryAll();
        for (User user : users) {
            System.out.println(user);
        }

    }

}


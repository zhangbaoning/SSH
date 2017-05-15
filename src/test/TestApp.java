package test;

import entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

/**
 * Created by zhangbaoning on 2017/5/12.
 */
public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setUsername("wang");
        user.setPassword("654321");
        userService.saveUser(user);
    }
    @Test
    public void save(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setUsername("wang");
        user.setPassword("654321");
        userService.saveUser(user);

    }
}

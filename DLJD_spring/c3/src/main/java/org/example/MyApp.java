package org.example;

import org.example.domain.MyUser;

import org.example.service.MyUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dell
 */
public class MyApp {
    public static void main(String[]args){
        String config="applicationContext.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(config);
        MyUser myUser= (MyUser) applicationContext.getBean("bUser");
        System.out.println(myUser);
        System.out.println("********************");


        MyUserService myUserService= (MyUserService) applicationContext.getBean("bService");
        myUserService.userService(myUser);

        //RepositoryImplement repositoryImplement= (RepositoryImplement) applicationContext.getBean("bRepository");
        //System.out.println(repositoryImplement);
    }
}

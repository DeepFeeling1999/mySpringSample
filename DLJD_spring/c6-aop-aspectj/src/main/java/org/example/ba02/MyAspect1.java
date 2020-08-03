package org.example.ba02;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Aspect中的注解
 * 表示当前类是切面类
 * 指用来给业务方法增加功能的类，在这个类中有切面功能的代码
 *
 * @author dell
 */
@Component
@Aspect
public class MyAspect1 {
    /**
     * 后置通知定义方法，方法是实现切面功能的
     * 方法定义要求
     * 1：公共方法 public
     * 2：没有返回值
     * 3：方法名称自定义
     * 4：方法有参数,推荐是Object,参数名自定义
     */

    /**
     * @AfterReturning 后置通知
     * 属性，1：Value 切入点表达式
     *      2：returning 自定义的变量，表示目标方法的返回值。
     *      自定义的变量名必须和通知方法的形参名一样
     * 特点：
     * 在目标方法之后执行
     * 能够获取目标方法的返回值。可以根据这个返回值做不同的处理
     * Object res=doOther();
     *
     * 可以修改这个返回值
     *
     * 后置通知的执行
     * Object res=doSome();
     *
     */
    @AfterReturning(value = "execution(* org.example.ba02.SomeServiceImpl.doSome(..))", returning = "res")
    public void myAfter(Object res) {
        //Object res：是目标方法执行后的返回值
        System.out.println("后置通知，返回值是"+res);

        ((Student)res).setAge(666);
        ((Student)res).setName("abcde");
    }
}

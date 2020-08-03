package org.example.ba04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
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
     * 异常通知定义方法
     * 1：公共方法 public
     * 2：没有返回值
     * 3：方法名称自定义
     * 4：方法有一个Exception，如果还有，则是JoinPoint
    */

    /**
     * @AfterThrowing: 异常通知
     * 属性：1：value 切入点表达式
     *       2：Throwing 自定义的变量，表示目标方法抛出的异常对象
     *  特点
     *  1：在目标方法抛出异常时执行
     *  2：可以做异常的监控程序，监控目标方法是不是有异常
     *     如果有异常，可以发送邮件，短信进行通知
     */
    @AfterThrowing(value="execution(* org.example.ba04.SomeServiceImpl.doSecond(..))",
    throwing = "e")
    public void myAfterThrowing(Exception e){
        System.out.println("代理对象发生异常时执行 "+e.getMessage());
    }

}

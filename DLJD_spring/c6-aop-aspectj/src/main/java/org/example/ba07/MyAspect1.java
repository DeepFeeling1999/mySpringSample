package org.example.ba07;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

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
     * 代理目标没有借口，spring会自动使用cglib方式来代理（继承）
     */
    @After(value="myPointcut()")
    public void myAfter(){
        System.out.println("最终通知07，总是被执行，常用来清理");
    }

    @Before(value = "myPointcut()")
    public void myBefore(){
        System.out.println("前置通知07");
    }

    @Pointcut(value = "execution(public void org.example.ba07.SomeServiceImpl.doThird(..))")
    private void myPointcut(){
        //用来定义切点的标记方法，一般写成私有的，因为不需要给外界调用
    }


}

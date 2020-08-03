package org.example.ba05;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
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
     * 异常通知定义方法
     * 1：公共方法 public
     * 2：没有返回值
     * 3：方法名称自定义
     * 4：方法有一个Exception，如果还有，则是JoinPoint
    */

    /**
     * @After；最终通知
     *          属性：value 切入点表达式
     */
    @After(value="execution(* org.example.ba05.SomeServiceImpl.doThird(..))")
    public void myAfter(){
        System.out.println("最终通知，总是被执行，常用来清理");
    }
}

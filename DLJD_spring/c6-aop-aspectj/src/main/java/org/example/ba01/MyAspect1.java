package org.example.ba01;

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
     * 定义方法，方法是实现切面功能的
     * 方法定义要求
     * 1：公共方法 public
     * 2：没有返回值
     * 3：方法名称自定义
     * 4：方法可以有参数，也可以没有参数
     *     如果有参数，参数不是自定义的，有几个参数类型可以使用
     */

    /**
     * @Before 前置通知
     *      value是切入点表达式，表示切面功能的执行位置
     * 特点
     * 在目标方法执行前执行
     * 不会改变目标方法
     * 不会影响目标方法
     */
    //@Before(value="execution(public void org.example.ba01.SomeServiceImpl.doSome(String,Integer))")
    //public void myBefore(){
    //    //功能
    //    System.out.println("目标方法执行之前输出时间+"+new Date());
    //}

    //@Before(value="execution(void org.example.ba01.SomeServiceImpl.doSome(String,Integer))")
    //public void myBefore(){
    //    //功能
    //    System.out.println("1目标方法执行之前输出时间+"+new Date());
    //}

    @Before(value="execution(void *..SomeServiceImpl.doSome(String,Integer))")
    public void myBefore(){
        //功能
        System.out.println("目标方法执行之前输出时间+"+new Date());
    }
    @Before(value="execution(void *..SomeServiceImpl.doSome(String,Integer))")
    public void mmyBefore(){
        //功能
        System.out.println("目标方法执行之前输出时间+"+new Date());
    }
}

package org.example.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
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
     * 环绕通知定义方法
     * 方法定义要求
     * 1：公共方法 public
     * 2：必须有一个返回值
     * 3：方法名称自定义
     * 4：方法有参数
     *
     * 特点
     * 是功能最强的通知
     * 前后都能通知
     * 控制目标方法是否被调用执行
     * 修改原来的目标方法的执行结果，影响最后的调用结果
     *
     * 环绕通知和jdk的动态代理InvocationHandler接口很像
     * 参数：ProceedingJoinPoint 等同于Method
     *       作用：执行目标方法
     *  返回值：就是目标方法的执行结果
     *
     *  环绕通知：经常拿来做事务，在目标方法之前开启事务，执行目标方法
     *  在目标方法之后提交事务
     */
    @Around(value="execution(* org.example.ba03.*.doFirst(..))")
    public Object myAround(ProceedingJoinPoint p) throws Throwable {

        Object result=null;
        System.out.println("环绕通知，在目标方法之前，输出时间+"+new Date());

        String name=null;
        Object []args=p.getArgs();
        if(args!=null&&args.length>1){
            name=(String)args[0];
        }
        if("名字".equals(name)){
            //相当于method.invoke();
            result=p.proceed();
        }
        System.out.println("环绕通知，在目标方法之后，提交事务");

        return result;
    }

}

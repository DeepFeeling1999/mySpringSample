package org.example.ba08;

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
    @After(value="myPointcut()")
    public void myAfter(){
        System.out.println("最终通知08，总是被执行，常用来清理");
    }

    @Before(value = "myPointcut()")
    public void myBefore(){
        System.out.println("前置通知08");
    }

    /**
     * @Pointcut:定义和管理切入点，如果你的项目中有多个切入点表达式是重复的，可复用的
     * 则可以使用@Pointcut
     * 属性：value 切入点表达式
     *
     * 特点：
     * 当使用@Pointcut定义在一个方法的上面，次数这个方法的名称就是切入点表达式的别名
     * 其他通知中，value就可以直接使用这个方法名称，代替切入点表达式了
     *
     * 方便统一管理，这里改动一下，相关的都会跟着改动
     */
    @Pointcut(value = "execution(public void org.example.ba08.SomeServiceImpl.doThird(..))")
    private void myPointcut(){
        //用来定义切点的标记方法，一般写成私有的，因为不需要给外界调用
    }


}

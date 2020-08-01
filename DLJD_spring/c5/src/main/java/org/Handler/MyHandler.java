package main.java.org.Handler;

import main.java.org.example.SomeTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandler implements InvocationHandler {

    private Object target;

    public MyHandler(Object target){
        this.target=target;
    }

    /**
     * 通过代理对象执行方法时，会调用这个invoke()
     * @param proxy 代理对象
     * @param method 代理方法
     * @param args  参数
     * @return  返回对象
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName());
        Object res=null;
        SomeTools.doSome();
        //通过代理对象执行方法时，会调用执行
        res=method.invoke(target,args);
        String methodName=method.getName();
        if("doSome".equals(methodName)){
            System.out.println("这是doSome 代理");
        }else{
            System.out.println("这是doOther 代理");
        }
        SomeTools.doOther();
        return null;
    }
}

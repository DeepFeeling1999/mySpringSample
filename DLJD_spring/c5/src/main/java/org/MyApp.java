package main.java.org;

import main.java.org.Handler.MyHandler;
import main.java.org.example.SomeService;
import main.java.org.example.SomeServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author dell
 */
public class MyApp {
    public static void main(String[] args) {
        SomeService someService = new SomeServiceImpl();

        InvocationHandler invocationHandler = new MyHandler(someService);

        SomeService proxy = (SomeService) Proxy.newProxyInstance(someService.getClass().getClassLoader(),
                                                                 someService.getClass().getInterfaces(),
                                                                 invocationHandler);

        System.out.println(proxy.getClass().getName());
        proxy.doSome();
        System.out.println("**************");
        proxy.doOther();
    }
}

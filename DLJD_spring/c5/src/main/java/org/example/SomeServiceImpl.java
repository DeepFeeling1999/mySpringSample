package main.java.org.example;

import java.util.Date;

/**
 * @author dell
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("doSome");
    }

    @Override
    public void doOther() {
        System.out.println("doOther");
    }
}

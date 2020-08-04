package org.example.ba08;
import org.example.ba02.Student;
import org.springframework.stereotype.Service;

/**
 * //目标类，需要增加功能
 * @author dell
 */
@Service
public class SomeServiceImpl implements someService {
    @Override
    public Student doSome(String name, Integer age) {
        //给doSome方法执行之前打印时间的功能
        System.out.println("目标方法doSome执行");
        return new Student("111",1);
    }

    @Override
    public void doOther(String name, Integer age) {
        System.out.println("目标方法doOther");
    }

    @Override
    public Student doFirst(String name, Integer age) {
        System.out.println("目标方法doFirst执行");
        return new Student("111",1);
    }

    @Override
    public void doSecond() {
        System.out.println("执行业务方法 doSecond");
        int num=1/0;
    }

    @Override
    public void doThird() {
        System.out.println("执行业务方法doThird");
     //   int num=1/0;
    }
}

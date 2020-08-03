package org.example.ba02;
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
}

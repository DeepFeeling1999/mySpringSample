package org.example.ba01;
import org.springframework.stereotype.Service;

/**
 * //目标类，需要增加功能
 * @author dell
 */
@Service
public class SomeServiceImpl implements someService {
    @Override
    public void doSome(String name, Integer age) {
        //给doSome方法执行之前打印时间的功能
        System.out.println("目标方法doSome执行");
    }
}

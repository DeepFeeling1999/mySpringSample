package org.example.ba01;

import org.springframework.stereotype.Component;

/**
 * @author dell
 * 1：@Repository 放在dao的实现类上
 *                表示创建dao对象，dao对象是能访问数据库的
 *
 * 2:@service 放在Service的实现类上面可以处理业务，有事务等功能
 *
 * 3：@Controller 用在控制器上，接受用户提交的参数，
 *                可以显示请求的处理结果
 * 三类都和@Component一样的，都能创建对象，但这三类是根据项目
 * 功能的对象来分配的
 * 用来给程序分层
 *
 *
 *
 * @Component: 创建对象，等同于<bean>
 *     属性value 就是对象的名称，等同于bean的id
 *              value是唯一的，创建的对象在spring容器中也是单一的
 * 此处等同于
 * <bean id="myStudent" class="org.example.ba01.Student"/>
 *
 * //@Component("myStudent")        //省略value
 * //@Component(value="myStudent")
 * //@Component    默认用的id是类名的首字母小写
 */
@Component(value="myStudent")
public class Student {
    String name ;
    private Integer ange;

    public Student(){
        System.out.println("666");
    }
    public void setAnge(Integer ange) {
        this.ange = ange;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", ange=" + ange + '}';
    }
}

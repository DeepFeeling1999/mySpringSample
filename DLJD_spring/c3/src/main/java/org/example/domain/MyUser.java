package org.example.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author dell
 */
@Component
public class MyUser {
    private String string="初值";

    private int test;
    private Date date;

    public MyUser(){
        System.out.println(this.toString());

        date=new Date();
        string="构造器中赋值";
        System.out.println("调用MyUser构造器");
    }
    public MyUser(String string,Date date){
        this.date=date;
        this.string=string;
    }
    public void setDate(Date date) {
        this.date = date;
        System.out.println("date set successfully");
    }

    public void setString(String string) {
        this.string = string;
    }

    public Date getDate() {
        return date;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "MyUser{" + "string='" + string + '\'' + ", date=" + date + '}';
    }
}

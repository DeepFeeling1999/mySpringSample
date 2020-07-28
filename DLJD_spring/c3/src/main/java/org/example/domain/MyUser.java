package org.example.domain;

import java.util.Date;

/**
 * @author dell
 */
public class MyUser {
    private String string;
    private Date date;
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

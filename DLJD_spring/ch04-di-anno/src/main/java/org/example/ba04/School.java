package org.example.ba04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author dell
 */
@Component
public class School {

    @Value("bei")
    private String school;
    @Value("hai")
    private String address;

    public void setSchool(String school) {
        this.school = school;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public String toString(){
        return "School{" + "school='" + school + '\'' + ", address='" + address + '\'' + '}';
    }
}


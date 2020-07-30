package org.example.ba06;

/**
 * @author dell
 */
public class School {
    private String school;
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
    public String toString() {
        return "School{" + "school='" + school + '\'' + ", address='" + address + '\'' + '}';
    }
}


package com.nikki.spring5.demo1.collection;

public class Course {
    private String cname;
    public void setCname(String cname) {
        this.cname = cname;
    }
    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}

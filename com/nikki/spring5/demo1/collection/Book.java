package com.nikki.spring5.demo1.collection;

import java.util.List;

public class Book {
    private List<String> bname;
    public void setBname(List<String> bname) {
        this.bname = bname;
    }
    public void out(){
        System.out.println(bname);
    }
}

package com.nikki.spring5.demo1;

public class Book {
    public Book(){};
    public Book(String bname,String another){
        this.bname = bname;
        this.another = another;
    }
    private String bname;
    private String another;
    private String price;

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setAnother(String another) {
        this.another = another;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bname='" + bname + '\'' +
                ", another='" + another + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

package com.example.mac.myassign;



/**
 * Created by Umer Rana on 28/10/2016.
 */
public class Book {
    private int id;
    private String name;
    private int price;
    private String Authorname1;
    private String Authorname2;
    private String Authorname3;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getAuthorname1() {
        return Authorname1;
    }
    public void setAuthorname1(String Authorname1) {
        this.Authorname1 = Authorname1;
    }
    public String getAuthorname2() {
        return Authorname2;
    }
    public void setAuthorname2(String Authorname2) {
        this.Authorname2= Authorname2;
    }

    public String getAuthorname3() {
        return Authorname3;
    }
    public void setAuthorname3(String Authorname3) {
        this.Authorname3 = Authorname3;
    }

    @Override
    public String toString() {
        return " Id= "+id + "\n Name= " + name + "\n Price= " + price + " \n Author Name 1 = " + Authorname1+ " \n Author Name 2 = " + Authorname2+ " \n Author Name 3 = " + Authorname3;
    }
}
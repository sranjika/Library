package com.libraryManagementSystem.beans;

public class Librarian extends Person
{


    private String name;
    private int id;

    public Librarian() {

    }

    public Librarian(String name, int id) {
        super();
        this.name = name;
        this.id = id;
    }



    @Override
    public   String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Librarian [user Name  :" + name + ", id is :" + id + "]";
    }

    public void getAllBook() {
    }
}

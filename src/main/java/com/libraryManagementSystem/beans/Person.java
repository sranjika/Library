package com.libraryManagementSystem.beans;

public class Person
{

    private int id;          //id of every person related to library
    private String name;     //name of every person related to library
    private String password; // password of every person related to library
    private Roles role;

    Person()  // non-par constructor
    {

    }

    public Person(int id, String name, String password,Roles role)    //para constructor
    {

        this.id = id;
        this.name = name;
        this.password = password;
        this.role=role;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

}

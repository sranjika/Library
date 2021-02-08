package com.libraryManagementSystem.beans;

import java.util.ArrayList;

public class Student extends Person
{
    private String studentName;
    private int studentId;


    public static ArrayList<Book> issued = new ArrayList<>();



    public Student(String studentName, int studentId) {
        this.studentName = studentName;
        this.studentId = studentId;
    }

    public ArrayList getListOfIssuedBooks(){
        return issued;
    }

    public void setIssued(Book book){
        issued.add(book);
    }



    public String getStudentName() {
        return studentName;
    }
    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }
    public int getstudentId() {
        return studentId;
    }
    public void setstudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student [student Name=" + studentName + ",student id=" + studentId + "]";
    }


}

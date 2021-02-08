package com.libraryManagementSystem.beans;

public class BookDetails {

    private int bookId;
    private int studentId;
    private String studentName;


    public void BookIssueDetails() {
    }

    public void BookIssueDetails(int bookId,int studentId, String studentName) {

        this.bookId=bookId;
        this.studentId = studentId;
        this.studentName = studentName;

    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Book Id=" + bookId + ", student Id=" + studentId + ", studentName=" + studentName +  "]";
    }
}

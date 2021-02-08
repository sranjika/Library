package com.libraryManagementSystem.serviceImpl;

import com.libraryManagementSystem.beans.Book;
import com.libraryManagementSystem.beans.Student;
import com.libraryManagementSystem.dao.IbookDao;
import com.libraryManagementSystem.dao.IstudentDao;
import com.libraryManagementSystem.daoImpl.BookDaoImpl;
import com.libraryManagementSystem.daoImpl.StudentDaoImpl;
import com.libraryManagementSystem.service.IlibrarianService;


import java.util.Scanner;


public class LibrarianServiceImpl implements IlibrarianService
{

    IbookDao bookDao = new BookDaoImpl();
    IstudentDao studentDao = new StudentDaoImpl();
    Scanner ss=new Scanner(System.in);
    @Override

    public void addBook() {

        System.out.println("Enter Book id,name,Author name,subject,pages,price ");
        System.out.println("Book id : ");
        int bookId = ss.nextInt();
        ss.nextLine();
        System.out.println("Book name : ");
        String bookName = ss.nextLine();
        System.out.println("Author name : ");
        String authorName = ss.nextLine();
        System.out.println("subject name : ");
        String subject = ss.nextLine();
        System.out.println("Book pages : ");
        int pages = ss.nextInt();
        System.out.println("Price : ");
        int price = ss.nextInt();
        ss.nextLine();



        bookDao.addBook( bookId, bookName, authorName, subject,pages, price);
        System.out.println("Book added successfully ");
        System.out.println(".....Choose another task..... ");


    }

    @Override
    public void getAllBook() {
        for (Book b :bookDao.getAllBooks() ) {
            System.out.println(b);

        }
        System.out.println(".....\nChoose another task..... ");
    }

    @Override
    public void searchBook() {

        System.out.print("Enter book name :");
        String bookName = ss.nextLine();
        bookDao.searchBook(bookName);
        System.out.println(".....\nChoose another task..... ");

    }

    @Override
    public void addStudent() {
        System.out.println("enter student name and id ");
        System.out.println("Student name : ");
        String studentName = ss.nextLine();
        System.out.println("Student id : ");
        int studentId = ss.nextInt();


        studentDao.addStudent(studentId,studentName);
        System.out.println("...... successfully added.... ");
        System.out.println(".....\nChoose another task..... ");
    }

    @Override
    public void viewAllStudent() {
        for(Student student : studentDao.getAllStudents()){
            System.out.println(student);
        }
        System.out.println(".....\nChoose another task..... ");

    }

    @Override
    public void deleteBook()
    {
        System.out.print("Enter book name which you want to delete : ");
        String bookName = ss.nextLine();
        Book book =  bookDao.searchBook(bookName);
        bookDao.deleteBook(book);

        System.out.println(".....\nChoose another task..... ");
    }

  }




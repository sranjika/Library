package com.libraryManagementSystem.serviceImpl;


import com.libraryManagementSystem.beans.Book;
import com.libraryManagementSystem.dao.IbookDao;
import com.libraryManagementSystem.dao.IstudentDao;
import com.libraryManagementSystem.daoImpl.BookDaoImpl;
import com.libraryManagementSystem.daoImpl.StudentDaoImpl;
import com.libraryManagementSystem.service.IstudentService;

import java.util.Scanner;

public class StudentServiceImpl implements IstudentService

{
        Scanner sa=new Scanner(System.in);
        IbookDao bookDao = new BookDaoImpl();
        IstudentDao studentDao = new StudentDaoImpl();

    @Override
    public void searchBook() {
        System.out.print("Enter book name :");
        String bookName = sa.nextLine();
        bookDao.searchBook(bookName);
    }

    @Override
    public void issueBook() {


        System.out.println("Please enter the Book name which book you want to issue: ");
        String bookName = sa.nextLine();

          Book book = bookDao.searchBook(bookName);
           bookDao.issueBook(book);

           System.out.println("...booko issued..\n");
    }

    @Override
    public void returnBook() {


        System.out.println("Please enter the bookId , bookName, authName, subject,pages, price which book you want to return: ");

        System.out.println("Book id : ");
        int bookId = sa.nextInt();
        sa.nextLine();
        System.out.println("Book name : ");
        String bookName = sa.nextLine();
        System.out.println("Author name : ");
        String authorName = sa.nextLine();
        System.out.println("subject name : ");
        String subject = sa.nextLine();
        System.out.println("Book pages : ");
        int pages = sa.nextInt();
        System.out.println("Price : ");
        int price = sa.nextInt();
        sa.nextLine();

        bookDao.addBook( bookId, bookName, authorName, subject,pages, price);

        System.out.println("Book returned successfully\n ");
        System.out.println(".....Choose another task..... ");

    }

    @Override
    public void getAllBooks()
    {
        for (Book b :bookDao.getAllBooks() ) {
            System.out.println(b);

        }
    }
}
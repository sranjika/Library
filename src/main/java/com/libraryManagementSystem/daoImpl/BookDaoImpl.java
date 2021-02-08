package com.libraryManagementSystem.daoImpl;

import com.libraryManagementSystem.beans.Book;
import com.libraryManagementSystem.beans.Student;
import com.libraryManagementSystem.dao.IbookDao;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class BookDaoImpl implements IbookDao
{

    Scanner s=new Scanner(System.in);

    public static LinkedList<Book> books = new LinkedList<>();

    @Override
    public void addBook(int bookId,String bookName, String authName,String subject, int pages,double price)
    {
        Book book = new Book( bookId , bookName, authName, subject,pages, price);
        books.add(book);

    }

    @Override
    public List<Book>  getAllBooks()
    {
        return books;

    }

    @Override
    public Book searchBook(String bookName)
    {
         boolean flag = false;

        for (Book b : books) {
            if (b.getBookName().equalsIgnoreCase(bookName)) {
                System.out.println(b);
                flag = true;
               return b;
            }
        }
        System.out.println("Book  doesn't exists!!");
        return null;
    }



    @Override
    public void deleteBook(Book book) {
        books.remove(book);
    }

     @Override
    public int getBookCount() {
        return books.size();
    }

    @Override
    public void issueBook(Book book)
    {
        book.setAvilable(false);
        books.remove(book);


    }
   @Override
    public void returnBook(Book book)
    {

        book.setAvilable(true);
        book.setIssuedTo(null);

    }


    public boolean getAvailability(Book book){
        return book.isAvilable();
    }


}

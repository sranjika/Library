package com.libraryManagementSystem.dao;


import com.libraryManagementSystem.beans.Book;

import java.util.List;

public interface IbookDao
{
    public void addBook(int bookId,String bookName, String authName,String subject, int pages,double price);

    public List<Book> getAllBooks();

    public Book searchBook(String bookName);

    public void deleteBook(Book book);
    public int getBookCount();
    public void issueBook(Book book);
    public void returnBook(Book book);
    public boolean getAvailability(Book book);


}



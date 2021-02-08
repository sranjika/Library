

package com.libraryManagementSystem.TestMain;


import com.libraryManagementSystem.beans.Book;
import com.libraryManagementSystem.beans.Student;
import com.libraryManagementSystem.daoImpl.BookDaoImpl;
import com.libraryManagementSystem.daoImpl.StudentDaoImpl;
import com.libraryManagementSystem.service.IloginService;
import com.libraryManagementSystem.serviceImpl.LoginServiceImpl;

import java.util.Scanner;

public class LibraryEntry
{

   public static void main(String[] args)
   {

         Book book0 = new Book(1, "hindi", "kamalnath", "hindi", 200,500);
         Book book2 = new Book(2, "english", "kp singh", "english", 110,67);
         Book book1 = new Book(3, "maths", "Rk shukla", "maths", 450,88);
         BookDaoImpl.books.add(book0);
         BookDaoImpl.books.add(book1);
         BookDaoImpl.books.add(book2);

         Student student1 = new Student("sranjika",1);
         Student student2 = new Student("swapnil", 2);
         StudentDaoImpl.studentList.add(student1);
         StudentDaoImpl.studentList.add(student2);


            IloginService log=new LoginServiceImpl();
              log.login();

   }





}


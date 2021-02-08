package com.libraryManagementSystem.serviceImpl;
import com.libraryManagementSystem.service.IloginService;
import org.apache.log4j.Logger;

import java.util.Scanner;


public class LoginServiceImpl implements IloginService
{


    private static final Logger log = Logger.getLogger(LoginServiceImpl.class);
    Scanner sc = new Scanner(System.in);
    LibrarianServiceImpl librarianService=new LibrarianServiceImpl();
    StudentServiceImpl studentService=new StudentServiceImpl();



    @Override
    public void login()
    {

        System.out.println(".......WELCOME TO LIBRARY.......");


        while (true) {
            System.out.println("librarian : 1 ");
            System.out.println(" Student : 2 ");

            int input = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter user name and password ");
            System.out.print("User Name ");
            String name = sc.nextLine();
            System.out.print("Password ");
            String pass = sc.nextLine();


            if (name.equalsIgnoreCase("librarian") && pass.equals("sranjika") && input == 1) {
                System.out.println("....................You are successfully loggedin............ " + name);
                LoginServiceImpl lib = new LoginServiceImpl();
                lib.showMenuForLibrarian();


            }

                    else if(name.equalsIgnoreCase("sranjika") && pass.equals("sranjika") && input == 2)
                          {

                        System.out.println("...........logged in.................... " + name );
                       LoginServiceImpl lib1 = new LoginServiceImpl();
                          lib1.showMenuForStudents();




                        System.out.println("Sorry! wrong input");
                    }

                }
            }


    public void showMenuForLibrarian()
    {
        System.out.println("1 : add new book");
        System.out.println("2 : view all books");
        System.out.println("3 : search for a book");
        System.out.println("4 : delete books");
        System.out.println("5 : Add a student");
        System.out.println("6 : View list of students");
        System.out.println("7 : return in main menu");
        System.out.println("8 : log out ");


        while (true)
        {
            log.info("CHOOSE YOUR TASK");
            int option = sc.nextInt();

            switch (option)
            {
                case 1:
                    librarianService.addBook();
                    break;
                case 2:
                    librarianService.getAllBook();
                    break;
                case 3:
                    librarianService.searchBook();
                    break;
                case 4:
                    librarianService.deleteBook();
                    break;
                case 5:
                    librarianService.addStudent();
                    break;
                case 6:
                    librarianService.viewAllStudent();
                    break;
                case 7:
                    showMenuForLibrarian();
                    break;
                case 8:
                    login();
                    break;

                default:
                    illegalInput();
            }
        }
    }

    public void showMenuForStudents()
    {


        System.out.println("1 : search book ");
        System.out.println("2 : issue book");
        System.out.println("3 : return book");
        System.out.println("4 : see all books");
        System.out.println("5 : return to the main menu");
        System.out.println("6 : log out of the sysetm");


        while (true)
        {
            System.out.print("Choose one option");
           int option=sc.nextInt();

            switch (option)
            {

                case 1:
                    studentService.searchBook();
                    break;
                case 2:
                    studentService.issueBook();
                    break;
                case 3:
                   studentService.returnBook();
                    break;
                case 4:
                    studentService.getAllBooks();
                case 5:
                    showMenuForStudents();
                    break;
                case 6:
                     login();
                    break;

                default :
                    illegalInput();
            }
        }
    }

    private void illegalInput()
    {
        System.out.println("wrong input selected, want to go back - (y / n)!");
         String option = sc.nextLine();

        if ("y".equals(option))
        {
               login();

        }
        else
            {
            System.out.println("Quit");
            System.exit(0);
        }
    }


}

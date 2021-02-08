package com.libraryManagementSystem.daoImpl;

import com.libraryManagementSystem.beans.Student;
import com.libraryManagementSystem.dao.IstudentDao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentDaoImpl implements IstudentDao
{


    public static LinkedList<Student> studentList = new LinkedList<>();
    public  int studentCount = studentList.size();

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public void addStudent(int studentId, String studentName)
    {

            Student student = new Student(studentName, studentId);
            studentList.add(student);

    }

    @Override
    public void deleteStudent(Student student) {

        studentList.remove(student.getId()-1);
        System.out.println("Student: id " + student.getstudentId() + ", deleted from database");
    }

    @Override
    public ArrayList booksIssued(Student student) {
        return student.getListOfIssuedBooks();
    }
}

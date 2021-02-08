package com.libraryManagementSystem.dao;

import com.libraryManagementSystem.beans.Student;

import java.util.ArrayList;
import java.util.List;

public interface IstudentDao
{

        public List<Student> getAllStudents();
        public void addStudent(int studentId, String studentName);
        public void deleteStudent(Student student);
        public ArrayList booksIssued(Student student);

}

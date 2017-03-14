package com.mycompany.app.data.dao;

import com.mycompany.app.Student;

/**
 * Created by Max on 14-Mar-17.
 */
public interface StudentsDao {
    void addStudent(Student student);
    Student getStudentById(int id);
}

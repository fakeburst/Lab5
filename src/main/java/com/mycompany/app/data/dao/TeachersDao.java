package com.mycompany.app.data.dao;

import com.mycompany.app.Teacher;

/**
 * Created by Max on 14-Mar-17.
 */
public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}

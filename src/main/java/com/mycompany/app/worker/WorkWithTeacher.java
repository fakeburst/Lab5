package com.mycompany.app.worker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.mycompany.app.data.dao.TeachersDao;
import com.mycompany.app.Teacher;

/**
 * Created by Max on 14-Mar-17.
 */
@Transactional
public class WorkWithTeacher {
    @Autowired
    private TeachersDao teachersDao;
    public Teacher addTeacher(Teacher teacher){
        teachersDao.addTeacher(teacher);
        System.out.println("Teacher has been added "+teacher);
        return teacher;
    }
    public Teacher getTeacherById(int id){
        return teachersDao.getTeacherById(id);
    }
    public void saveTacher(Teacher teacher){
        teachersDao.saveTeacher(teacher);
        System.out.println("Teacher has been saved "+teacher);
    }
}

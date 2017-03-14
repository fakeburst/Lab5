package com.mycompany.app.worker;

import com.mycompany.app.Student;
import com.mycompany.app.data.dao.StudentsDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Max on 14-Mar-17.
 */
public class WorkWithStudents {
    @Autowired
    private StudentsDao studentsDao;

    public void saveStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }
}


package com.hemanth.crud_Postgress.controller;

import com.hemanth.crud_Postgress.Dao.StudentDao;
import com.hemanth.crud_Postgress.Entity.Student;
import com.hemanth.crud_Postgress.service.StudentService;
import com.hemanth.crud_Postgress.service.StudentServiceImpl;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    StudentService ss;

    @Autowired
    StudentController(StudentService ssnew)
    {
        ss=ssnew;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/details")
    public List<Student> getStudents()
    {
        return ss.findAll();

    }

    @RequestMapping(method = RequestMethod.GET,value = "/details/{studentId}")
     public Student getStudentById(@PathVariable int studentId)
    {
        Student mresult=ss.findById(studentId);
        return mresult;
    }

    @RequestMapping(method = RequestMethod.POST,value = "/post")
    public Student saveStudents(@RequestBody Student sr)
    {
        sr.setUsn(0);// to auto generate
        Student result=ss.save(sr);
        return result;

    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/delete/{studentId}")
    public void StudentDelete(@PathVariable int studentId)
    {
        ss.deleteStudent(studentId);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/update")
     public void updateStudent(@RequestBody Student stud)
    {
        ss.updateStudent(stud);
    }
}

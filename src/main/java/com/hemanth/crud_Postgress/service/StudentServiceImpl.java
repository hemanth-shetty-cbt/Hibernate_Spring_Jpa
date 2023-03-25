package com.hemanth.crud_Postgress.service;

import com.hemanth.crud_Postgress.Dao.StudentDao;
import com.hemanth.crud_Postgress.Entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
  StudentDao studentDao;


  @Autowired
  public StudentServiceImpl(StudentDao stdao)
  {
      studentDao=stdao;
  }


    @Override
    @Transactional
    public List<Student> findAll()
    {
        return studentDao.findAll();
    }

  @Override
  @Transactional
  public Student findById(int id)
  {
    return studentDao.findById(id);
  }

  @Override
  @Transactional
  public Student save(Student stud)
  {
    return studentDao.save(stud);
  }

  @Override
  @Transactional
  public void deleteStudent(int id)
  {
   studentDao.deleteStudent(id);

  }

  @Override
  @Transactional
  public void updateStudent(Student stud)
  {

    studentDao.updateStudent(stud);
  }

}


/*

spring.security.user.name=user
spring.security.user.password=root
 */
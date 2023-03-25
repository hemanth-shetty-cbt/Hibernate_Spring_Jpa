package com.hemanth.crud_Postgress.service;

import com.hemanth.crud_Postgress.Entity.Student;

import java.util.List;

public interface StudentService
{
  public List<Student> findAll();

  public Student findById(int id);

  public Student save(Student stud);

  public void deleteStudent(int id);

  public void updateStudent(Student stud);

}

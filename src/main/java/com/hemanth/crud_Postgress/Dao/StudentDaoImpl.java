package com.hemanth.crud_Postgress.Dao;

import com.hemanth.crud_Postgress.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao
{
    EntityManager entityManager;

    @Autowired
    StudentDaoImpl(EntityManager em)
    {
        entityManager=em;
    }

    @Override
    public List<Student> findAll()
    {

        TypedQuery<Student> theQuery=entityManager.createQuery("from Student",Student.class);
        List<Student> result=theQuery.getResultList();

        return result;
    }

    @Override
    public Student findById(int id)
    {
       return entityManager.find(Student.class,id);

    }

    @Override
    public Student save(Student stud)
    {
        Student r= entityManager.merge(stud);
        return r;
    }

    @Override
    public void deleteStudent(int id)
    {

        Student mmi=entityManager.find(Student.class,id);

        entityManager.remove(mmi);
    }

    @Override
    public void updateStudent(Student stud)
    {

        entityManager.merge(stud);
    }


}

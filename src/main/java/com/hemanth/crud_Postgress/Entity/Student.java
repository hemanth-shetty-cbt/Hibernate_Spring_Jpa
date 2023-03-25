package com.hemanth.crud_Postgress.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
  private int usn;

    @Column(name="first_name")
  private String firstname;

    @Column(name="last_name")
  private String lastname;
    @Column(name="branch")
  private String branch;

}

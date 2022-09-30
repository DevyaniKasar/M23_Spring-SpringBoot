package com.example.demo;



import org.springframework.data.jpa.repository.JpaRepository;
/* JPA Repository is exists in spring data JPA 
   and it contains all the CURD operation of spring JPA */
public interface StudentRepository extends JpaRepository<Student,Integer>
{

}

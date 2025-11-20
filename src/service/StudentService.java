package service;

import models.Student;

import java.util.List;

public interface StudentService extends Cloneable{
    void addStudent(Student student);
    List<Student> displayStudents();
List<Student>sortByName();
List<Student> sortByGrades();



}

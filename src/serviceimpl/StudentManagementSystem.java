package serviceimpl;

import DataBase.DB;
import models.Student;
import service.StudentService;

import java.util.Comparator;
import java.util.List;

public class StudentManagementSystem implements StudentService {
    @Override
    public void addStudent(Student student) {
        DB.students.add(student);

    }

    @Override
    public List<Student> displayStudents() {

        return  DB.students;
    }

    @Override
    public List<Student> sortByName() {
        DB.students.sort(Comparator.comparing(Student::getFullName));
        return DB.students;
    }

    @Override
    public List<Student> sortByGrades() {
        DB.students.sort(Comparator.comparing(Student::getPrice).reversed());
        return DB.students;
    }


}

import models.Student;
import service.StudentService;
import serviceimpl.StudentManagementSystem;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentManagementSystem();
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("""
                    1) Dobavit studenta
                    2) Pokazat spisok
                    3) Sortirovat po imeni
                    4) Sortirovat po price
                    5) Viyti
                    """);

            int san = scanner.nextInt();
            scanner.nextLine();

            switch (san) {

                case 1 -> {
                    System.out.print("ID: ");
                    long id = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Full name: ");
                    String fullName = scanner.nextLine();

                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Name group: ");
                    String group = scanner.nextLine();

                    System.out.print("Price: ");
                    double price = scanner.nextDouble();

                    studentService.addStudent(new Student(id, fullName, age, group, price));
                    System.out.println("Student dobavlen!");
                }

                case 2 -> {
                    System.out.println("Spisok studentov:");
                    System.out.println(studentService.displayStudents());
                }

                case 3 -> {
                    studentService.sortByName();
                    System.out.println("Otsortirovano po imeni:");
                    System.out.println(studentService.sortByName());
                }

                case 4 -> {
                    studentService.sortByGrades();
                    System.out.println("Otsortirovano po price:");
                    System.out.println(studentService.sortByGrades());
                }

                case 5 -> {
                    isTrue = false;
                    System.out.println("Viyhod...");
                }

                default -> System.out.println("Nepravilniy vybor!");
            }
        }
    }
}


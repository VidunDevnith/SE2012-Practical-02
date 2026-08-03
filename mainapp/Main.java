package mainapp;
import java.util.Scanner;
import models.Student;
import services.EnrollmentManager;
/**
 * Main class for the Student Management System.
 */
public class Main {
    /**
     * Starts the Student Management System.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student[] students = new Student[100];
        int studentCount = 0;
        EnrollmentManager manager = new EnrollmentManager();
        int choice;
        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Enroll Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Sort Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    if (studentCount < students.length) {
                        System.out.print("Enter Student ID: ");
                        String id = input.nextLine();
                        System.out.print("Enter Student Name: ");
                        String name = input.nextLine();
                        students[studentCount] = new Student(id, name);
                        studentCount++;
                        System.out.println("Student enrolled successfully.");
                    } else {
                        System.out.println("Student list is full.");
                    }
                    break;
                case 2:
                    if (studentCount == 0) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("\nStudent List");
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = input.nextLine();
                    Student found = manager.searchStudentById(students, studentCount, searchId);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    manager.sortStudentsByName(students, studentCount);
                    System.out.println("Students sorted successfully.");
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
        input.close();
    }
}


import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String studentID;
    private String name;
    private int age;

    static ArrayList<Student> studentList = new ArrayList<>();

    // Constructor
    public Student(String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
    }

    // Save Student
    public static void saveStudent(Scanner input) {
        System.out.print("Enter Student ID: ");
        String id = input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        int age = 0;
        while (true) {
            System.out.print("Enter Student Age (≥16): ");
            try {
                age = Integer.parseInt(input.nextLine());
                if (age >= 16) break;
                else System.out.println("Age must be 16 or older.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a number.");
            }
        }

        studentList.add(new Student(id, name, age));
        System.out.println("✅ Student saved successfully!\n");
    }

    // Search Student
    public static void searchStudent(Scanner input) {
        System.out.print("Enter Student ID to search: ");
        String id = input.nextLine();
        for (Student s : studentList) {
            if (s.studentID.equalsIgnoreCase(id)) {
                System.out.println("Student Found:");
                System.out.println(s);
                return;
            }
        }
        System.out.println("❌ Student not found.\n");
    }

    // Delete Student
    public static void deleteStudent(Scanner input) {
        System.out.print("Enter Student ID to delete: ");
        String id = input.nextLine();
        for (Student s : studentList) {
            if (s.studentID.equalsIgnoreCase(id)) {
                System.out.print("Are you sure you want to delete this student? (yes/no): ");
                String confirm = input.nextLine();
                if (confirm.equalsIgnoreCase("yes")) {
                    studentList.remove(s);
                    System.out.println("✅ Student deleted.\n");
                } else {
                    System.out.println("❌ Deletion cancelled.\n");
                }
                return;
            }
        }
        System.out.println("❌ Student not found.\n");
    }

    // View Report
    public static void studentReport() {
        System.out.println("\n=== Student Report ===");
        if (studentList.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
        System.out.println();
    }

    // Exit
    public static void exitStudentApplication() {
        System.out.println("👋 Exiting application. Goodbye!");
        System.out.println("© 2025 MudiNetCraft. All rights reserved.\n");
        System.exit(0);
    }

    // toString
    public String toString() {
        return "ID: " + studentID + ", Name: " + name + ", Age: " + age;
    }
}

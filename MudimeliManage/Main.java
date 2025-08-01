import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("===== Mudimeli University Student Management System =====");
            System.out.println("1. Capture a new student");
            System.out.println("2. Search for a student");
            System.out.println("3. Delete a student");
            System.out.println("4. View student report");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    Student.saveStudent(input);
                    break;
                case "2":
                    Student.searchStudent(input);
                    break;
                case "3":
                    Student.deleteStudent(input);
                    break;
                case "4":
                    Student.studentReport();
                    break;
                case "5":
                    Student.exitStudentApplication();
                    break;
                default:
                    System.out.println("❌ Invalid choice. Try again.\n");
            }
        }
    }
}

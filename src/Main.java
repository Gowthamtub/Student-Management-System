
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManagement sm = new StudentManagement();

        int choice;

        do {

            System.out.println("\n===============================");
            System.out.println(" STUDENT MANAGEMENT SYSTEM");
            System.out.println("===============================");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sm.addStudent();
                    break;

                case 2:
                    sm.displayStudents();
                    break;

                case 3:
                    sm.searchStudent();
                    break;

                case 4:
                    sm.updateStudent();
                    break;

                case 5:
                    sm.deleteStudent();
                    break;

                case 6:
                    System.out.println("\nThank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();
    }
}
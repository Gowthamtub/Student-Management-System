import java.util.Scanner;

public class StudentManagement {

    Scanner sc = new Scanner(System.in);

    student[] students = new student[100];
    int count = 0;

    // Add Student
    public void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        students[count] = new student(id, name, age, department);

        count++;

        System.out.println("\nStudent Added Successfully!");
    }

    // Display Students
    public void displayStudents() {

        if (count == 0) {
            System.out.println("\nNo Students Available.");
            return;
        }

        System.out.println("\n===== Student List =====");

        for (int i = 0; i < count; i++) {
            students[i].display();
        }
    }

    // Search Student
    public void searchStudent() {

        System.out.print("Enter Student ID to Search: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (students[i].id == id) {

                System.out.println("\nStudent Found");

                students[i].display();

                found = true;

                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    // Update Student
    public void updateStudent() {

        System.out.print("Enter Student ID to Update: ");
        int id = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (students[i].id == id) {

                System.out.print("Enter New Name: ");
                students[i].name = sc.nextLine();

                System.out.print("Enter New Age: ");
                students[i].age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter New Department: ");
                students[i].department = sc.nextLine();

                System.out.println("Student Updated Successfully!");

                found = true;

                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

    // Delete Student
    public void deleteStudent() {

        System.out.print("Enter Student ID to Delete: ");
        int id = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (students[i].id == id) {

                for (int j = i; j < count - 1; j++) {

                    students[j] = students[j + 1];

                }

                students[count - 1] = null;

                count--;

                System.out.println("Student Deleted Successfully!");

                found = true;

                break;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }
    }

}

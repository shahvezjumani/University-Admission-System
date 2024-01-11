package Class_Files;

import java.util.Scanner;

public class UniversityAdmissionSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StudentList overallStudentList = new StudentList();
        String [] departments = {"Computer Science","BBA","Electrical Engineering"};

        StudentBST studentBST = new StudentBST();
        InterviewQueue admissionQueue = new InterviewQueue();

        while (true) {
            System.out.println("University Admission System\n\n");
            System.out.println("1. Insert Students record");
            System.out.println("2. Interview process");
            System.out.println("3. Search Students record");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    for (int i=0;i<departments.length;i++){
                        System.out.println((i+1)+" "+departments[i]);
                    }
                    System.out.print("Enter Department (1-3): ");
                    int departmentIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline

                    Student student = new Student(id, name, departments[departmentIndex]);

                    admissionQueue.enqueue(student);
                    System.out.println("Student record inserted successfully.");
                    break;

                case 2:
                    System.out.println("Interview process - Approve the students for enrollment");
                    Node temp = admissionQueue.front;
                    boolean approve = false;

                    while (temp != null){
                        temp.data.display();
                        System.out.println("\nType TRUE for approve and FALSE for not");
                        approve = scanner.nextBoolean();
                        if(approve){
                            overallStudentList.insert(temp.data);
                            studentBST.insert(temp.data);
                        }
                        temp = temp.next;
                    }
                    break;

                case 3:
                    System.out.print("Enter Student ID to search: ");
                    int searchId = scanner.nextInt();
                    Student foundStudent = studentBST.search(searchId);
                    if (foundStudent != null) {
                        System.out.println("Student found:");
                        foundStudent.display();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

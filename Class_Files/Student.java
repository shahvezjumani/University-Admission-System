package Class_Files;

public class Student {
    int id;
    String name;
    String department;

    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public void display() {
        System.out.println("ID: " + id + "\tName: " + name + "\tDepartment: " + department);
    }
}

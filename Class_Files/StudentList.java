package Class_Files;

public class StudentList {
    Node head;

    public void insert(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            current.data.display();
            current = current.next;
        }
    }
}

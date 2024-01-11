package Class_Files;

public class InterviewQueue {
    Node front, rear;

    public void enqueue(Student student) {
        Node newNode = new Node(student);
        if (front == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Student dequeue() {
        if (front == null) {
            return null; // Queue is empty
        }
        Student student = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return student;
    }

    public void display() {
        Node current = front;
        while (current != null) {
            current.data.display();
            current = current.next;
        }
    }
}

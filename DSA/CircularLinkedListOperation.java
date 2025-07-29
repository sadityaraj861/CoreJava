package DSA;

public class CircularLinkedListOperation {
    static class CircularLinkedList {
        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                next = null;
            }
        }

        Node head, tail;

        // Insert at the beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                tail.next = head;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head;
            }
        }

        // Insert at the end
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                tail.next = head;
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;
            }
        }

        // Delete from the beginning
        public void deleteFromBeginning() {
            if (head == null) {
                System.out.println("List is empty.");
            } else {
                if (head == tail) {
                    head = tail = null;
                } else {
                    head = head.next;
                    tail.next = head;
                }
            }
        }

        // Delete from the end
        public void deleteFromEnd() {
            if (head == null) {
                System.out.println("List is empty.");
            } else {
                if (head == tail) {
                    head = tail = null;
                } else {
                    Node temp = head;
                    while (temp.next != tail) {
                        temp = temp.next;
                    }
                    tail = temp;
                    tail.next = head;
                }
            }
        }

        // Display the list
        public void display() {
            if (head == null) {
                System.out.println("List is empty.");
            } else {
                Node temp = head;
                do {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                } while (temp != head);
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        // Circular Linked List
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBeginning(100);
        cll.insertAtEnd(200);
        cll.insertAtEnd(300);
        cll.display();
        cll.deleteFromBeginning();
        cll.display();
        cll.deleteFromEnd();
        cll.display();
    }
}

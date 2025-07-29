package DSA;

public class SinglyLinkedListOperation {
    static class SinglyLinkedList {
        class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head = null;

        // Insert at the beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Insert at the end
        public void insertAtEnd(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        // Delete from the beginning
        public void deleteFromBeginning() {
            if (head != null) {
                head = head.next;
            }
        }

        // Delete from the end
        public void deleteFromEnd() {
            if (head == null || head.next == null) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }

        // Display the list
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        // Singly Linked List
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertAtBeginning(10);
        sll.insertAtEnd(20);
        sll.insertAtEnd(30);
        sll.display();
        sll.deleteFromBeginning();
        sll.display();
        sll.deleteFromEnd();
        sll.display();

    }
}

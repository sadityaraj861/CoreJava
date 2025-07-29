package DSA;

public class DoublyLinkedListOperation {
    static class DoublyLinkedList {
        class Node {
            int data;
            Node next, prev;
            Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }

        private Node head = null;

        // Insert at the beginning
        public void insertAtBeginning(int data) {
            Node newNode = new Node(data);
            if (head != null) {
                head.prev = newNode;
            }
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
                newNode.prev = temp;
            }
        }

        // Delete from the beginning
        public void deleteFromBeginning() {
            if (head != null) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            }
        }

        // Delete from the end
        public void deleteFromEnd() {
            if (head == null || head.next == null) {
                head = null;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.prev.next = null;
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
        // Doubly Linked List
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(5);
        dll.insertAtEnd(10);
        dll.insertAtEnd(15);
        dll.display();
        dll.deleteFromBeginning();
        dll.display();
        dll.deleteFromEnd();
        dll.display();

    }

}

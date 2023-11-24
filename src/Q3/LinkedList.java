package Q3;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    void makeLoop(int x){
        Node temp = head;
        Node ptr = null;
        int count = 1;
        while (temp != null){
            if (count == x)
                ptr = temp;
            count++;
            temp = temp.next;
        }
        temp.next = ptr;
    }

    Node detectCycle() {
        Node slow = head, fast = head;

        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (slow != fast) {
            return null; // No cycle
        }

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // Cycle found
    }
}


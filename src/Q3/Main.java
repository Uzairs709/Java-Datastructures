package Q3;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));

        // Creating a loop for testing, loop starting from second node
        list.makeLoop(2);

        Node cycleNode = list.detectCycle();
        if (cycleNode != null) {
            System.out.println("Cycle detected at node: " + cycleNode.data);
        } else {
            System.out.println("No cycle detected");
        }
    }
}

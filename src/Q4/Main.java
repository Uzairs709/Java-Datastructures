package Q4;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToTheLast(new Node(1));
        list.addToTheLast(new Node(2));
        list.addToTheLast(new Node(3));
        list.addToTheLast(new Node(4));
        list.addToTheLast(new Node(5));

        Node middleNode = list.findMiddleNode();
        if (middleNode != null) {
            System.out.println("Middle node: " + middleNode.data);
        } else {
            System.out.println("List is empty");
        }
    }
}

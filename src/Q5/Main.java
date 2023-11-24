package Q5;

public class Main {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addToTheLast(new Node(1));
        list1.addToTheLast(new Node(3));
        list1.addToTheLast(new Node(5));

        LinkedList list2 = new LinkedList();
        list2.addToTheLast(new Node(2));
        list2.addToTheLast(new Node(4));
        list2.addToTheLast(new Node(6));

        Node mergedListHead = LinkedList.mergeLists(list1.head, list2.head);

        System.out.print("Merged List: ");
        while (mergedListHead != null) {
            System.out.print(mergedListHead.data + " ");
            mergedListHead = mergedListHead.next;
        }
    }
}

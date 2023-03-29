/**
 * Linkedlist
 */
public class Linkedlist {

    Node head;

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    // To add frist Node
    public void AddNodeFrist(String data) {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    // to add at last
    public void AddLast(String data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node lastnode = head;
        while (lastnode.next != null) {
            lastnode = lastnode.next;
        }
        lastnode.next = newnode;

    }

    public void printList() {
        Node currNode = head;
        while (currNode.next != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.AddNodeFrist("this");
        list.AddNodeFrist("is ");
        list.AddLast("Linkedlist");
        list.printList();
    }
}

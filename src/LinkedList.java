/*
public class LinkedList {

    Node head;
    private static class Node{

        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }

    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.head= new Node(10);
        Node secondNode = new Node(11);
        Node thirdNode = new Node(12);
        Node fourthNode = new Node(13);
        l.head.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        Node curr = l.head;
        while(curr!=null)
        {
            System.out.println("data"+curr.data);
            curr=curr.next;
        }
    }
}
*/

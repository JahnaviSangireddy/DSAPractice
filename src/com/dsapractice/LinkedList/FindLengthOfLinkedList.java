package com.dsapractice.LinkedList;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class FindLengthOfLinkedList {
    public static void main(String[] args) {
        /*
        Input: LinkedList = 1->3->1->2->1
        Output: 5
         */
        // Create a hard-coded linked list:
        // 1 -> 3 -> 1 -> 2 -> 1
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        // Function call to count the number of nodes
        System.out.println("Count of nodes is "
                + countNodes(head));
    }

    private static int countNodes(Node head) {
        int count = 0;
        Node curr = head;
        while(curr!=null){
            curr = curr.next;
            count++;
    }
      return count;
}
}

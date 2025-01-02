package com.dsapractice.LinkedList;

public class PrintLinkedList {
    public static void main(String[] args) {
        /*
        Input: 1->2->3->4->5->null
Output: 1 2 3 4 5
Explanation: Every element of each node from head node to last node is printed.
         */

        // Create a linked list: 10 -> 20 -> 30 -> 40
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        printList(head);
    }

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data+" , ");
            curr = curr.next;
        }
    }
}

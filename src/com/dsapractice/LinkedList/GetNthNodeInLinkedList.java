package com.dsapractice.LinkedList;

public class GetNthNodeInLinkedList {
    public static void main(String[] args) {
        /*
        Input:  1->10->30->14,  index = 2
        Output: 10
        Explanation: The node value at index 2 is 10
         */

        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.printf("Element at index 3 is %d",
                GetNth(head, 3));
    }

    private static int GetNth(Node head, int pos) {
        Node curr = head;
        for(int i=1; i<pos; i++){
            curr = curr.next;
        }
        if(curr == null){
            return -1;
        }
        return curr.data;
    }
}

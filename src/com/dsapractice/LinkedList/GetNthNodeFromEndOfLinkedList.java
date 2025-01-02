package com.dsapractice.LinkedList;

public class GetNthNodeFromEndOfLinkedList {
    public static void main(String[] args) {
        /*
        Input: 1 -> 2 -> 3 -> 4, N = 3
        Output: 2
        Explanation: Node 2 is the third node from the end of the linked list
         */
        // Create a hard-coded linked list:
        // 35 -> 15 -> 4 -> 20
        Node head = new Node(35);
        head.next = new Node(15);
        head.next.next = new Node(4);
        head.next.next.next = new Node(20);

        // Function Call to find the 4th node from end
        System.out.println(findNthFromLast(head, 4));
    }

    private static int findNthFromLast(Node head, int pos) {
        Node curr = head;
        int length=0;
        while(curr!=null){
            length++;
            curr = curr.next;
        }

        int posfrmst = length - pos +1;
        Node temp = head;
        for(int i=1; i<posfrmst; i++){
            temp = temp.next;
        }
        return temp.data;
    }

}

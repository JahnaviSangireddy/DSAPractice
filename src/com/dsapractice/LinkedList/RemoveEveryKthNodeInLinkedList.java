package com.dsapractice.LinkedList;

public class RemoveEveryKthNodeInLinkedList {
    public static void main(String[] args) {
        /*
        Input: LinkedList: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> 10, k = 3
        Output: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10
        Explanation: After removing every 3rd node of the linked list, the resultant linked list will be: 1 -> 2 -> 4 -> 5 -> 7 -> 8 -> 10.
         */
        // Create a hard-coded linked list:
        // 1 -> 2 -> 3 -> 4 -> 5 -> 6
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        int k = 2;

        head = deleteK(head, k);

        printListHere(head);
    }

    private static Node deleteK(Node head, int k) {
        Node curr = head; Node prev=null;
        int c=1;
        while(curr!=null){
           if(c%k ==0){
               if(prev!=null){
                   prev.next = curr.next;
               }else{
                   head = curr.next;
               }
           }else{
               prev = curr;
           }
           curr = curr.next;
           c++;
        }
        return head;
    }

    private static void printListHere(Node head) {
        Node curr = head;
        while (curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

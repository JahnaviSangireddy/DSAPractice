package com.dsapractice.LinkedList;

public class SearchInLinkedList {
    public static void main(String[] args) {
        /*
        Input: 14 -> 21 -> 11 -> 30 -> 10, key = 14
        Output: Yes
        Explanation: 14 is present in the linked list.
         */

        Node head = new Node(14);
        head.next = new Node(21);
        head.next.next = new Node(11);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(10);

        int key = 4;

        if (searchKey(head, key))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean searchKey(Node head, int key) {
        Node curr = head;
        while(curr!=null){
            if(curr.data == key){
                return true;
            }
            curr = curr.next;
        }
        return false;
    }
}

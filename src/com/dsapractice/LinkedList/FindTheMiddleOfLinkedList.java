package com.dsapractice.LinkedList;

public class FindTheMiddleOfLinkedList {
    public static void main(String[] args) {
        /*
        Input: linked list: 1->2->3->4->5
        Output: 3
        Explanation: There are 5 nodes in the linked list and there is one middle node whose value is 3

        Approach: use 2 pointers. one slow pointer which moves one node ahead and one fast pointer
        which moves 2 nodes ahead. By the time the fast pointer reaches end the slow pointer will be at middle.

         */
        // Create a hard-coded linked list:
        // 10 -> 20 -> 30 -> 40 -> 50 -> 60
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next = new Node(70);

        System.out.println(getMiddle(head));
    }

    private static int getMiddle(Node head) {
        Node curr = head;
        Node slow = curr; Node fast = curr;
        while (fast != null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}

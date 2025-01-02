package com.dsapractice.LinkedList;

public class DeletionInLinkedList {
    public static void main(String[] args) {
        /*
        removing the first node,
        removing a node in the middle, or
        removing the last node.
         */

        // Creating a linked list
        // 1 -> 2 -> 3 -> 4 -> 5 -> null
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original list: ");
        printList(head);
        System.out.println();
        // Deleting the head node
        head = deleteHead(head);
        System.out.println(
                "List after deleting the head: ");
        printList(head);
        System.out.println();
        // Deleting node at position 2
        int position = 2;
        head = deleteNode(head, position);

        // Print list after deletion
        System.out.println("List after deletion of position: "+position);
        printList(head);
        System.out.println();

        // Removing the last node
        head = removeLastNode(head);

        System.out.println("List after removing the last node: ");
        printList(head);
    }

    private static Node removeLastNode(Node head) {
        if(head==null){ //list is empty
            return null;
        }
        if(head.next == null){ //list has only one elm
            return null;
        }
        Node curr = head;
        Node prev = null;
        while(curr.next !=null){
            prev = curr;
            curr = curr.next;
        }
        prev.next=null;
        return head;
    }

    private static Node deleteNode(Node head, int position) {
        int count=1;
        Node curr= head;
        Node prev = null;
        for(int i=0; i<position-1; i++){
            prev = curr;
            curr = curr.next;
        }
        prev.next = curr.next;
        curr = null;
        return head;
    }

    private static Node deleteHead(Node head) {
        if(head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    private static void printList(Node head) {
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
}

package com.dsapractice.LinkedList;

public class InsertANewNode {
    /*
    Given a Linked List, the task is to insert a new node in this given Linked List at the following positions:

    At the front of the linked list
    Before a given node.
    After a given node.
    At a specific position.
    At the end of the linked list.
     */
    public static void main(String[] args) {
        // Create the linked list 2->3->4->5
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);


        head = insertAtFront(head, 1);
        printLinkedList(head);
        System.out.println("*************************");

        head = insertAfter(head, 3, 4);
        System.out.println();
        printLinkedList(head);
        System.out.println("************************");

        head = insertBeforeKey(head, 7, 6);
        printLinkedList(head);
        System.out.println("************************");

        head = insertAtPosition(head, 2, 12);
        printLinkedList(head);
        System.out.println("************************");

        head = insertAtEnd(head, 1);
        printLinkedList(head);
        System.out.println("************************");

    }

    private static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }

    private static Node insertAtPosition(Node head, int pos, int data) {
        Node newNode = new Node(data);
        Node curr = head; int count=1;
        Node prev = null;
        while(curr!=null){
            prev = curr;
            curr = curr.next;
            count++;
            if(count == pos){
                break;
            }
        }
        prev.next = newNode;
        newNode.next = curr;
        return head;
    }

    private static Node insertBeforeKey(Node head, int key, int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while(curr != null){
            if(curr.next.data == key){
                break;
            }
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("key not found");
            return head;
        }
        Node temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
        return head;
    }

    private static Node insertAfter(Node head, int key, int data) {
        Node newNode = new Node(data);
        Node curr = head;
        while(curr!= null){
            if(curr.data == key){
                break;
            }
            curr = curr.next;
        }
        if(curr == null){
            System.out.println("key not found");
            return head;
        }
        Node temp = curr.next;
        curr.next = newNode;
        newNode.next =temp;
        return head;
    }

    private static void printLinkedList(Node head) {
        Node curr = head;
        while(curr !=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    private static Node insertAtFront(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }
}

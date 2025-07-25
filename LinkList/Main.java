package apx.LinkList;

import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Main {
    // Method to delete the x-th node from the list
    static Node deleteNode(Node head, int x) {
        // If the node to be deleted is the head
        if (x == 1) {
            return head.next; // Return the second node as the new head
        }

        Node temp = head;
        int count = 1;

        // Traverse to the (x-1)-th node
        while (temp != null && count < x - 1) {
            temp = temp.next;
            count++;
        }

        // If the node to delete exists
        if (temp != null && temp.next != null) {
            temp.next = temp.next.next; // Skip the x-th node
        }

        return head;
    }

    // Method to print the linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    // Method to build a linked list from input
    static Node buildList(int[] elements) {
        Node head = new Node(elements[0]);
        Node temp = head;

        for (int i = 1; i < elements.length; i++) {
            temp.next = new Node(elements[i]);
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = sc.nextInt(); // Number of nodes
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = sc.nextInt();
        }
        int x = sc.nextInt(); // Position of node to delete

        // Build the linked list
        Node head = buildList(elements);

        // Delete the x-th node
        head = deleteNode(head, x);

        // Print the modified list
        printList(head);

        sc.close();
    }
}


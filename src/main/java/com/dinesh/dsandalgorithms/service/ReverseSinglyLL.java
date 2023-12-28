package com.dinesh.dsandalgorithms.service;

import com.dinesh.dsandalgorithms.model.ListNode;

import java.util.Objects;

public class ReverseSinglyLL {
    public void reverseSinglyLinkedList(){
        ListNode head = createSinglyLinkedList();
        System.out.println("Before reversing ");
        printSinglyLinkedList(head);

        //head = reverseSinglyLinkedListRecursion(head);
        head = reverseSinglyLLIteration(head);
        System.out.println("After reversing");
        printSinglyLinkedList(head);

    }

    private ListNode reverseSinglyLinkedList(ListNode head) {
        if(Objects.isNull(head) || Objects.isNull(head.getNext())) {
            return head;
        }

        //recursion
        ListNode newNode = reverseSinglyLinkedList(head.getNext());

        head.getNext().setNext(head);
        head.setNext(null);

        return newNode;
    }

    private ListNode reverseSinglyLLIteration(ListNode head) {
        ListNode prev =null;

        while(head != null) {
            ListNode next = head.getNext();
            head.setNext(prev);
            prev = head;
            head = next;
        }
        return prev;
    }

    private ListNode createSinglyLinkedList(){
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3, null);
        head.setNext(node2);
        node2.setNext(node3);
        return head;
    }

    private void printSinglyLinkedList(ListNode head){
        if(Objects.isNull(head.getNext())) {
            System.out.println(head.getValue()+"->NULL");
            return;
        }
        System.out.print(head.getValue()+"->");
        printSinglyLinkedList(head.getNext());
    }

}

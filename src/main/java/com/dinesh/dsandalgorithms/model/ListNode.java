package com.dinesh.dsandalgorithms.model;

public class ListNode {
    Integer value;
    ListNode next;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode(){}
    public ListNode(Integer value){
        this.value=value;
    }
    public ListNode(Integer value, ListNode next){
        this.value=value;
        this.next=next;
    }
}

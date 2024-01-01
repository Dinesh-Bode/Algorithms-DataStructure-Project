package com.dinesh.dsandalgorithms;

import com.dinesh.dsandalgorithms.service.MajorityElement;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootConfiguration
@SpringBootApplication
public class DsAndAlgorithmsApplication {
    public static void main(String[] args) {
        //1. Reverse singly linked list using recursion
        //ReverseSinglyLL reverseSinglyLL = new ReverseSinglyLL();
        //reverseSinglyLL.reverseSinglyLinkedList();

        //. Majority element
        MajorityElement findMajorityElement = new MajorityElement();
        int majorityElement = findMajorityElement.majorityElement(new int[]{20, 20, 20, 10, 0, -1});
        System.out.println("Majority Element in array :: " + majorityElement);
    }
}

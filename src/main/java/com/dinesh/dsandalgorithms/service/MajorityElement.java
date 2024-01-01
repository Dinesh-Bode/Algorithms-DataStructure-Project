package com.dinesh.dsandalgorithms.service;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        //Calculate based on Moore voting algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}

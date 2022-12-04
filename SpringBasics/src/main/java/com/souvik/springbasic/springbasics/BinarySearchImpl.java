package com.souvik.springbasic.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class BinarySearchImpl {

    @Autowired
    SortingAlgo sortingAlgo;

    // return true if element present else false
    public boolean search(int[] nums,int target){

        sortingAlgo.sort(nums);

        int start=0,end=nums.length;
        while(start <= end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]<target) start++;
            else end--;
        }
        return false;
    }
}

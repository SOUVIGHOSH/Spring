package com.souvik.springbasic.springbasics;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortingAlgo implements SortingAlgo{
    @Override
    public void sort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }
}

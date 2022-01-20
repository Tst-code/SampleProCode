package com.Programs;

public class LargestSumContiguousSubarray
{
    public static void main(String[] args)
    {
        //Given an integer array nums, find the contiguous subarray (containing at least one number)
        // which has the largest sum and return its sum.
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};  //output= 6
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};  //output= 7

        maxSumSubArray(arr);
    }
    static void maxSumSubArray(int[] a)
    {
        int max_sum = 0, MaxEnd_curt_sum = 0, start = 0, end = 0, s = 0;

        for(int i=0; i< a.length; i++)  // i= 8
        {
            MaxEnd_curt_sum += a[i];        // 1 + 4 = 5

            if(MaxEnd_curt_sum>max_sum)     // 5 > 6  =f
            {
                max_sum = MaxEnd_curt_sum;  // 6
                start = s;                  // 3
                end = i;                    // 6
            }

            if(MaxEnd_curt_sum < 0)         // 1 < 0=f
            {
                MaxEnd_curt_sum = 0;        // 0
                s = i + 1;                  // 2+1= 3
            }
        }
        System.out.println("Maximum contiguous sum is " + max_sum);
        System.out.println("Starting index " + start);
        System.out.println("Ending index " + end);
    }
}

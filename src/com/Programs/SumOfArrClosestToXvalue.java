package com.Programs;

import java.util.Arrays;

public class SumOfArrClosestToXvalue
{
    public static void main(String[] args)
    {
        int arr[] =  {10, 22, 28, 29, 30, 40}, x = 54; //The closest pair is 22 and 30
        int arr2[] = {8, 7, 2, 5, 3, 1}, x2 = 10; //The closest pair is (8, 1)
        int arr3[] = {5, 2, 6, 8, 1, 9}, x3 = 12; //Pair not found

        SumClosestXnum(arr3, x3);
//        SumEqToXnum(arr, x);
    }

    // Prints the pair with sum cloest to x
    static void SumClosestXnum(int arr[], int x)
    {
        int n = arr.length;
        int res_l=0, res_r=0;  // To store indexes of result pair

        // Initialize left and right indexes and difference between
        // pair sum and x
        int l = 0, r = n-1, diff = Integer.MAX_VALUE;

        // While there are elements between l and r
        while (r > l)
        {
            // Check if this pair is closer than the closest pair so far
            if (Math.abs(arr[l] + arr[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] - x);
            }

            // If this pair has more sum, move to smaller values.
            if (arr[l] + arr[r] > x)
                r--;
            else // Move to larger values
                l++;
        }

        System.out.println(" The closest pair is "+arr[res_l]+" and "+ arr[res_r]);
    }


    // Function to find pair in an array having sum eq to given X-num using sorting
    public static void SumEqToXnum(int[] nums, int target)
    {
        // sort the array in ascending order
        Arrays.sort(nums);

        // maintain two indices pointing to endpoints of the array
        int low = 0;
        int high = nums.length - 1;

        // reduce the search space `nums[low…high]` at each iteration of the loop

        // loop till the search space is exhausted
        while (low < high)
        {
           if (nums[low] + nums[high] == target)
            {
                System.out.println("Pair found (" + nums[low] + "," + nums[high] + ")");
                return;
            }

            // increment `low` index if the total is less than the desired sum;
            // decrement `high` index if the total is more than the desired sum
            if (nums[low] + nums[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

}

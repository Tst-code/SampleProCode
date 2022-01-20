package com.Logical;

import java.util.Arrays;

public class Array3rdHhValue
{
    public static void main(String[] args)
    {
        int []num={10, 2, 5, 4, 6, 17, 11, 22};     //3rd Highest Value - 11
       ThirdLargeNum(num);
    }

    static void ThirdLargeNum(int[] arr)
    {
        int max=0, max2=0;
        for (int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[i]<arr[j])
                    max=arr[j];
                else if (arr[i]<arr[j])
                    max2=arr[j];
            }
        }
        System.out.println("Max : "+max+"\n2nd max : "+max2);
//        Arrays.sort(arr);
//
//        int val=arr[arr.length-3];

    }
}

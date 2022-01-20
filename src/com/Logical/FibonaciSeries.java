package com.Logical;

public class FibonaciSeries
{
    public static void main(String[] args)
    {
        System.out.println("Enter number of terms/digits");
        int a=0, b=1;
        System.out.print(a+" "+b+" ");

        for(int i=1;i<=10;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}

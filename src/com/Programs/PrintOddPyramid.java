package com.Programs;

public class PrintOddPyramid
{
    public static void main(String[] args)
    {
        Arrow(4);
    }

    static void Arrow(int rows)
    {
        int k=1;
        for (int i = 1; i <= rows; i++)
        {
            for(int space=rows; space>i; space--)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
            }
            k+=2;
            System.out.println();
        }

        k-=2;

        for (int i = 1; i <= rows; i++)
        {
            for(int space=1; space<i; space++)
                System.out.print(" ");

            for (int j = rows; j >= i; j--)
            {
                System.out.print(k + " ");
            }
            k-=2;
            System.out.println();
        }
    }
}

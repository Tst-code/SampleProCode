package com.Programs;

import java.util.Scanner;

public class PrintPascalsTriangle
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Row Size for Pascal Triangle: ");
        int row = s.nextInt();

        Acn(row);
        Dcn(row);

    }

    static void Acn(int row)
    {
        int num;

        for(int i=0; i<row; i++)
        {
            for(int space=row; space>i; space--)
                System.out.print(" ");

            num=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(num+ " ");  //i=3 , j=2, num=3
                num = num*(i-j)/(j+1);     //3*(3-2) / (2+1)
            }                              //num=  3 / 3 = 1
            System.out.print("\n");
        }
    }

    static void Dcn(int row)
    {
        int num;

        for(int i=row; i>0; i--)
        {
            for(int space=i; space<row; space++)
                System.out.print(" ");

            num=1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(num+ " ");  //i=4 , j=2, num=1
                num = num*(i-j)/(j+1);     //3*(3-2) / (2+1)
            }                              //num=  3 / 3 = 1
            System.out.print("\n");
        }
    }
}

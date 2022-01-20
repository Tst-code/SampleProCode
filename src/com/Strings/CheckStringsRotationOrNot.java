package com.Strings;

import java.util.Scanner;

public class CheckStringsRotationOrNot
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string value");
        String str=sc.nextLine();
        String str1=sc.nextLine();
        boolean status;

        String str2 = str + str;
        if (str2.contains(str1))
        {
           status=true;
            System.out.println("Yes " + str + " is rotation of " + str1);
        }
        else
        {
            System.out.println("No " + str + " is not rotation of " + str1);
        }


    }
}

package com.Logical;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string value");
        String str=sc.nextLine();

        StringBuffer sf=new StringBuffer(str);

        if (str.equalsIgnoreCase(sf.reverse().toString()))
            System.out.println(str+" is Palindrome");
        else
            System.out.println(str+" is not Palindrome");
    }
}

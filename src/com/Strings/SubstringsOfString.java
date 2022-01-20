package com.Strings;

import java.util.Scanner;

public class SubstringsOfString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string value");
        String str=sc.nextLine();
        int count=0;

        System.out.println("All substring of "+str+" are:");
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i+1; j <= str.length(); j++)
            {
                String str2=str.substring(i,j);
                if (str2.length()==5 && !str2.contains(" "))
                {
                    System.out.println(str2);
                    count++;
                }
            }
        }
        System.out.println("Total no substrings of string "+str+" are : "+count);
    }
}

package com.Strings;

import java.util.Scanner;

public class FirstNonRepChString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string value");
        String str=sc.nextLine();


        for(char i :str.toCharArray())
        {
            if ( str.indexOf(i) == str.lastIndexOf(i))
            {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }

}

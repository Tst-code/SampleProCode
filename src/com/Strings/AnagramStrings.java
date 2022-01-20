package com.Strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramStrings
{
    //Two strings are called anagrams if they contain same set of characters but in different order.
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two string values");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        boolean status;

        if (str1.length()!=str2.length())
        {
            status=false;
        }
        else
        {

            char[] c1 = str1.toLowerCase().toCharArray();
            char[] c2 = str2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);

            status=Arrays.equals(c1, c2);
        }

        if (status==true)
        {
            System.out.println(str1 + " and " + str2 + " are anagrams");
        }
        else
        {
            System.out.println(str1 + " and " + str2 + " are not anagrams");
        }
    }
}

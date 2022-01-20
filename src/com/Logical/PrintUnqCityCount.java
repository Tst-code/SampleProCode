package com.Logical;

import java.util.HashSet;
import java.util.Set;

public class PrintUnqCityCount
{
    public static void main(String[] args)
    {
        String st[][]={{"1001","2","Pune", "sip:abc@xyz.com","1" , "2","3"},
                       {"1001","2","Mumbai", "sip:abc@xyz.com","1" , "2","3"},
                       {"1001","2","Pune", "sip:abc@xyz.com","1" , "2","3"},
                       {"1001","2","Nagpur", "sip:abc@xyz.com","1" , "2","3"}};

        CityCount(st);
    }

    static void CityCount(String [][] str)
    {
        Set ht=new HashSet<>();
        int count=0;
        for (int i = 0; i < str.length; i++)
        {
            if (ht.add(str[i][2])==false)
            {
                System.out.println("Duplicate City : "+ str[i][2]);
                count++;
            }
        }
        System.out.println("Total no of duplicates : "+count);
    }
}

package com.Logical;

import java.util.Arrays;
import java.util.List;

public class FindNumNonNumInList
{
    public static void main(String[] args)
    {
        String st[]={"abcd","Pune", "623","Mumbai", "10"};

        List<String> lt= Arrays.asList(st);

        System.out.println(lt);
        output(lt);

    }

    static void output(List<String> list)
    {
        int num=0, nonnum=0;

        for (int i = 0; i < list.toArray().length; i++)
        {
            try
            {
                int j = Integer.parseInt(list.get(i));
                num++;
            }
            catch (NumberFormatException e)
            {
                nonnum++;
            }
        }
        System.out.println("Numeric values : "+num+"\nNon Numeric values : "+nonnum);
    }
}

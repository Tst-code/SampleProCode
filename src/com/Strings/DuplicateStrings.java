package com.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateStrings
{
    public static void main(String[] args)
    {
        String s = "python java selenium java";
        int count=0;
        String sr[]=s.split(" ");
        System.out.println(sr.length+"\n***********");

        List<String> ls= Arrays.asList(sr);
        Set<String> st=new HashSet<String>();

        for (String o:ls)
        {
            if(st.add(o)==false)
            {
                System.out.println(o);
                count++;
            }
        }
        System.out.println("Total duplicates : "+count);

    }
}

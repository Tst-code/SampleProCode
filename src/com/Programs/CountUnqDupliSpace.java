package com.Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountUnqDupliSpace
{
//    given on string like "A B ABCABC AB A B "
//    - count spaces
// 	  - count duplicates
//    - count uniques
    public static void main(String[] args)
    {
        String str="A B ABCABC AB A B ";
        char []str2=str.toCharArray();

//        List<String> ls=
        Set<String> ht=new HashSet<String>();

//        int dupli=0;
//        for (String o: ls)
//        {
//           if (ht.add(o)==false)
//               dupli++;
//        }

//        System.out.println("Spaces : "+str2.length+"\nDuplicates : "+dupli+"\nUniques : "+ht.size());
//
//        int count = 0;
//        for (int i = 0; i < str2.length; i++) {
//                for (int j = i + 1; j < str2.length; j++)
//                {
//                    if (str2[j].compareTo(str2[i]) == 0)
//                        count++;
//                }
//        }
//
//        System.out.println("Uniques values doesn't have its duplicates : "+count);
    }
}

package com.Logical;

import java.util.Scanner;

public class Find_LCM_GCF
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        int gcd=1;
        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            //divides both the numbers by i, if the remainder is 0 the number is completely divisible by i
            // Checks that i is present in both or not
            // returns true if both conditions are true
            if(n1 % i == 0 && n2 % i == 0)
                //assigns i into gcd
                gcd = i;
        }

        int gcf = gcd;
        int lcm = (n1 * n2) / gcf;

        System.out.println("The Greatest common divisor (GCF) of two numbers are: " + gcf);
        System.out .println("The Lowest common multiplier (LCM) of two numbers are: " + lcm);
        sc.close();
    }

    public static int GCF(int a, int b)  //Greatest Common Divisor
    {
        if (b == 0) { return a; }
        else { return (GCF(b, a % b)); }
    }

}

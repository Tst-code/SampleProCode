package com.Programs;

public class Matrix
{
    public static void main(String[] args)
    {
        int[][] mtx={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        displayUpper_LowerTriangle(mtx);

    }

    // Function to display upper and lower triangle
    static void displayUpper_LowerTriangle(int[][] matrix)
    {
        int order = matrix.length;
        int i,j,sumUp=0, sumDn=0;
        for(i=0; i<order; i++)
        {
            for(j=0; j<order;j++)
                if (i > j)
                    System.out.print("  ");
                else
                {
                    System.out.print(matrix[i][j] + " ");
                    sumUp += matrix[i][j];
                }
            System.out.println();
        }

        for(i=0; i<order; i++)
        {
            for(j=0; j<order;j++)
                if (i < j)
                    System.out.print("  ");
                else
                {
                    System.out.print(matrix[i][j] + " ");
                    sumDn += matrix[i][j];
                }
            System.out.println();
        }
        System.out.println("Sum of upper matrix triangle : "+sumUp);
        System.out.println("Sum of lower matrix triangle : "+sumDn);
    }
}

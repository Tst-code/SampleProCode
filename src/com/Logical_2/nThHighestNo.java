package com.Logical_2;

public class nThHighestNo
{
    public static void main(String[] args)
    {
        int []num={10, 2, 5, 4, 6, 17, 11, 22};     //3rd Highest Value - 11

        nThHighest(num,2);
    }

    static void nThHighest(int[] array, int nThNo)
    {
        int size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j])
                {
                   int temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
                }
            }
        }
        System.out.println(nThNo+" largest number is:: "+array[size-nThNo]);
    }
}

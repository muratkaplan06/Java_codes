package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int[] myInteger=getInteger(5);

        System.out.println(Arrays.toString(myInteger));
        double Average=getAverage(myInteger);
        System.out.println("Average= "+Average);
    }
    public static int[] getInteger(int number){
        System.out.println("Enter "+number+" integer values.\r");
        int[] values=new int[number];
        for(int i=0;i<number;i++)
            values[i]=scanner.nextInt();
        return values;
    }
    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++)
            sum+=array[i];
        return (double)sum/(double)array.length;
    }
}

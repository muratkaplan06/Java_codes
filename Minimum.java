package com.company;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        System.out.println("min= "+findMin(readElements(readInteger())));
    }
    public static int readInteger(){
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter count:");
        int count=scanner1.nextInt();
        return count;
    }
    private static int[] readElements(int count){
        Scanner scanner2=new Scanner(System.in);
        int[] Array=new int[count];
        for(int i=0;i<Array.length;i++){
            System.out.println("Enter numbers:");
            int numbers=scanner2.nextInt();
            scanner2.nextLine();
            Array[i]=numbers;
        }
        return Array;
    }
    private static int findMin(int[] array){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            int value=array[i];
            if(value<min)
               min=value;
        }
        return min;
    }
}

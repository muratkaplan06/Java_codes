package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {

    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

     printArray(sortInteger(getInteger(5)));
    }
    public static int[] getInteger(int capacity){
        int[] array=new int[capacity];
        System.out.println("Enter "+capacity+" integer values.\r");
        for(int i=0;i<capacity;i++)
            array[i]=scanner.nextInt();
        return array;
    }
    public static void printArray(int[] array){
        System.out.println("sorting array:");
        for (int i=0;i<array.length;i++)
            System.out.println("Element "+i+" contents "+array[i]);
    }
    public static int[] sortInteger(int[] Array){
        int[] sortArray=new int[Array.length];
        for(int i=0;i<Array.length;i++)
            sortArray[i]=Array[i];
        boolean flag=true;
        int temp;
        while (flag){
            flag=false;
            for (int i=0;i<sortArray.length-1;i++){
                if(sortArray[i]<sortArray[i+1]){
                    temp=sortArray[i];
                    sortArray[i]=sortArray[i+1];
                    sortArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortArray;
    }
}

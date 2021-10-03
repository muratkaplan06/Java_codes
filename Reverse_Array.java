package com.company;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] array={1,5,3,7,11,9,15};
        System.out.println("Array= "+ Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array= "+Arrays.toString(array));
    }
    public static void reverse(int[] Array){
        int maxIndex=Array.length-1;
        int halfLength=Array.length/2;
        for(int i=0;i<halfLength;i++){
            int temp=Array[i];
            Array[i]=Array[maxIndex-i];
            Array[maxIndex-i]=temp;
        }
    }
}

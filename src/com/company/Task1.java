package com.company;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int l1;
        int l2;
        if(arr.length%2!=0){
            l1 = (int) ((arr.length+1)/2);
            l2 = (int) (arr.length-(arr.length+1)/2);
        }else{
            l1 = (int) (arr.length/2);
            l2 = (int) (arr.length/2);
        }
        int[] sub1 = new int[l1];
        int[] sub2 = new int[l2];
        for(int i=0; i<l1; i++){
            sub1[i]= Integer.valueOf(arr[i]);
        }
        for(int j=0; j<l2; j++) {
            sub2[j] = Integer.valueOf(arr[l1+j]);
        }
        int sum1 = 0;
        int sum2 = 0;
        int mult1 = 1;
        int mult2 = 1;
        for(int i=0; i<sub1.length; i++){
            sum1 = sum1+sub1[i];
            mult1 = mult1*sub1[i];
        }
        for(int i=0; i<sub2.length; i++){
            sum2 = sum2+sub2[i];
            mult2 = mult2*sub2[i];
        }
        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Mult1: " + mult1);
        System.out.println("Mult2: " + mult2);
    }
}
/* 1) The task is to divide an array into two sub-array
        (left and right) containing n/2 elements each and
        do the sum of the subarrays and then multiply
        both the subarrays.
 */
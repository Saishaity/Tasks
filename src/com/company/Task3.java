package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int d = Integer.valueOf(data[1]);
        String[] arr = scanner.nextLine().split(" ");

        for(int i = 2; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(arr[0] + " ");
        System.out.print(arr[1]);
    }
}
/*
Given an unsorted array arr[] of size N,
rotate it by D elements (Anti - clockwise).

Input:
First line of each test case contains two space separated elements,
N denoting the size of the array and an integer D denoting the number
size of the rotation.
Subsequent line will be the N space separated array elements.

5 2
1 2 3 4 5

10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6
 */
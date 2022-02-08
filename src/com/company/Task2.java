package com.company;

public class Task2 {
    public static void main(String[] args) {
        String[] names = {"Mike", "Joseph", "Inga", "Loraline", "Leo"};
        String answer = names[0];
        for(int i=0; i<names.length; i++){
            if(names[i].length()>answer.length()){
                answer = names[i];
            }
        }
        System.out.println(answer);
    }
}
/*
Given a list of names, display the longest name.
For example: N = 5
names[] = { "Geek", "Geeks", "Geeksfor",
  "GeeksforGeek", "GeeksforGeeks" }

Output:
GeeksforGeeks
 */
package org.example;

public class average {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=0; i<=10; i++){
            sum += i;
        }
        System.out.println(sum);
        int average = sum/10;
        System.out.println(average);
    }
}

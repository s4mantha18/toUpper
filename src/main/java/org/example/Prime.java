package org.example;

import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        int num = new Scanner(System.in).nextInt();
        if (num%2==0){
            System.out.println("This is not a prime number");
        } else{
            System.out.println("PRIME NUMBER!!");
        }
    }
}

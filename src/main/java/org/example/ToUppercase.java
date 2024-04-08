package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ToUppercase {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word = new Scanner(System.in).nextLine();
        String firstletter = word.substring(0,1);
        String remaining = word.substring(1,word.length());
        System.out.println(firstletter.toUpperCase()+remaining);
    }
}

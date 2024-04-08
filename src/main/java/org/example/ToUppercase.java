package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ToUppercase {
    public static void main(String[] args) {
        System.out.println("Enter a word:");
        String word = new Scanner(System.in).nextLine();
        String firstletter = String.valueOf(word.charAt(0));
        String remaining = word.substring(1,word.length()).toLowerCase();
        System.out.println(firstletter.toUpperCase()+remaining);
    }
}

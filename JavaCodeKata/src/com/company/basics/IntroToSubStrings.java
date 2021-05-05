package com.company.basics;

import java.util.Scanner;

public class IntroToSubStrings {

    public static void PrintSubString()
    {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();

        Integer L = scanner.nextInt();
        Integer R = scanner.nextInt();

        scanner.close();

        System.out.println(A.substring(L,R+1));
    }
}

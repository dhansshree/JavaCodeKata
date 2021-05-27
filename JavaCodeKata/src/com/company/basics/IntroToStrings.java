package com.company.basics;

import java.util.Locale;
import java.util.Scanner;

public class IntroToStrings {

    public static void ThreeTasks()
    {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        scanner.close();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes": "No");
        System.out.println(A.toUpperCase()+' '+ B.toUpperCase());

    }



    public static void solve(String S, Integer L , Integer R)
    {
        /*StringBuilder  stringBuilder = new StringBuilder(S);

        String a = S.substring(L,R+1);
        StringBuffer  reverseMe = new StringBuffer(a);
        reverseMe.reverse();

        StringBuffer b = new StringBuffer(S);
        b.replace(L,R+1,b.toString());


        String sub = s.substring(L,R + 1);
        StringBuffer a = new StringBuffer(sub);
        a.reverse();
        String temp = a.toString();
        StringBuffer b = new StringBuffer(s);
        b.replace(L,R+1,temp);
        return b.toString();


            Try to use StringBuilder to solve this problem.*/
    }
}

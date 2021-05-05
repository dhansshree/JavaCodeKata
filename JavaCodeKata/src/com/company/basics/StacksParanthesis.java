package com.company.basics;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Stack;

public class StacksParanthesis {

    public static void PerformCheck()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] parenthesisInput= new String[n];
        int[] output = new int[n];

        for(int i=0;i<n;i++){
            parenthesisInput[i]= sc.next();
                output[i] = checkParenthesis(parenthesisInput[i]) == true ?  1 : 0;
        }
        sc.close();

        for(int i=0;i<n;i++){
            System.out.println(output[i]);
        }

    }

    private static boolean checkParenthesis(String input)
    {
        Stack<Character> stk = new Stack<Character>();
        for (int i=0; i<input.length();i++)
        {
            if(input.charAt(i) == '(')
            {
                stk.add(input.charAt(i));
            }

            if(input.charAt(i) == ')' && stk.empty())
            {
                return false;
            }

            if(input.charAt(i) == ')' && !stk.empty())
            {
                if(stk.peek() == '(') {
                    stk.pop();
                }
            }
        }

       return stk.empty();

    }
}

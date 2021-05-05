package com.company.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {

    public static void IsBigIntegerPrime()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the prime number to be tested:");
        BigInteger A = new BigInteger(scanner.next());
        if(A.isProbablePrime(100))
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}

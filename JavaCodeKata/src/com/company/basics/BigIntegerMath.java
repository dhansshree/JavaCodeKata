package com.company.basics;

import java.util.Scanner;
import java.math.BigInteger;

public class BigIntegerMath {

    public static void AddBigIntegersAndPrint()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the BigInteger Value A:");
        BigInteger A = new BigInteger(scanner.next());

        System.out.println("Enter the BigInteger Value A:");
        BigInteger B = new BigInteger(scanner.next());

        scanner.close();

        BigInteger C = A.add(B);
        System.out.println("This is the value of A + B is:" + C);

    }
}

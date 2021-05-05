package com.company.basics;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class BigDecimalMath {

    public static void PrintInDescAsIs()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal[] bigDecimalArr= new BigDecimal[n];
        for(int i=0;i<n;i++){
            bigDecimalArr[i]= new BigDecimal(sc.next());
        }
        sc.close();

        for(int i = 0;i<n;i++){

        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(bigDecimalArr[i]);
        }
    }
}

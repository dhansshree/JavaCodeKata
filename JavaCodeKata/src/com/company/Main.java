package com.company;

import com.company.basics.*;

import java.lang.reflect.Method;
import java.util.HashMap;


class Printer
{
    //Write your code here
    public  static <T> void printArray(T[] input)
    {
        for(int i=0; i< input.length;i++)
        {
            System.out.println(input[i]);
        }
    }

}

public class Main {

    public static void main(String[] args) {
        // write your code here
        UtilityIntro.HashSet();


        //UtilityIntro.StudentDBList();
        //UtilityIntro.Print();

     /*   Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");*/




    }
}

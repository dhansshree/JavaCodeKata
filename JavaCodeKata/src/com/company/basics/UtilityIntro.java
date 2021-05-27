package com.company.basics;

import java.text.NumberFormat;
import java.util.*;

public class UtilityIntro {

    public static void StudentDBList()
    {
        HashMap<String, Integer> studentList = new HashMap<>();
        ArrayList<String> inputList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        for(int i=1;i<=input;i++)
        {
            String name = scanner.next();
            Integer id = scanner.nextInt();
            studentList.put(name,id);
        }

        Integer queries = scanner.nextInt();
        for(int i=1;i<=queries;i++)
        {
            String name = scanner.next();
            inputList.add(name);
        }

        for (String elem:inputList) {
            if(studentList.containsKey(elem))
            {
                System.out.println(studentList.get(elem));
            }
            else
            {
                System.out.println("Not Found");
            }

        }

    }

    public static void Print()
    {
        Scanner scanner = new Scanner(System.in);
        Double payment = scanner.nextDouble();

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.println("US: " + nf.format(payment));

        Locale indian = new Locale("en", "IN");
        NumberFormat indianFormat = NumberFormat.getCurrencyInstance(indian);

        System.out.println("India: " + indianFormat.format(payment));

    }
}

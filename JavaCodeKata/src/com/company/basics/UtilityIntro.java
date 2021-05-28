package com.company.basics;

import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.text.NumberFormat;
import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.*;
import java.util.regex.Pattern;

public class UtilityIntro {

    public static void printDay()
    {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        //System.out.println(getDay(day, month, year));

    }

    public static void getDay(String day, String month, String year) {
        /*Calendar calendar = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayWeekText = new SimpleDateFormat("EEEE").format(calendar.getD);
        System.out.println("Day of week in text:"+dayWeekText);*/
    }

    public static void HashSet()
    {
        Set<Integer> integerHashSet = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        for(int i=1;i<=input;i++)
        {
            Integer id = scanner.nextInt();
            if(!integerHashSet.contains(id))
                integerHashSet.add(id);
        }
        System.out.println(integerHashSet.size());
    }


    public static void PatternValidate()
    {
        Set<Integer> integerHashSet = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();

        ArrayList<String> output = new ArrayList<>();
        for(int i=1;i<=input;i++)
        {
            String data = scanner.next();
            try
            {
                Pattern.compile(data);
                output.add("Valid");
            }
            catch (Exception ex)
            {
                output.add("Invalid");
            }

        }
        for (String elem:output
             ) {
            System.out.println(elem);
        }
    }

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

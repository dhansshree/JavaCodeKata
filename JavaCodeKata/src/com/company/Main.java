package com.company;
import com.company.HashingExercises.*;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Integer[] inputArray = new Integer[] {-1, 1 , 2};
        ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(inputArray));
        System.out.println(findSubArrayWithSum0.solve(inputList));

    }
}

package com.company.HashingExercises;

import java.util.ArrayList;
import java.util.HashSet;

public class findSubArrayWithSum0 {
    //To:Do CheckWithScore
    public static int solve(ArrayList<Integer> list)
    {
        HashSet map = new HashSet();
        long sum = 0;
        for (int i = 0; i< list.size(); i++)
        {
            sum = sum + list.get(i);
            if(sum == 0 || list.get(i) == 0 ||map.contains(sum))
                return 1;
            map.add(sum);
        }
        return 0;
    }


}

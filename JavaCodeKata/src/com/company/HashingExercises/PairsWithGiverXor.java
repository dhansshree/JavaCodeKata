package com.company.HashingExercises;

import java.util.ArrayList;
import java.util.HashSet;

public class PairsWithGiverXor {

    //To:Do Revisit
    public int solve(ArrayList<Integer> A, int B) {

        int result = 0;
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < A.size(); i++)
        {
            if (s.contains(B ^ A.get(i)))
            {
                result++;
            }
            s.add(A.get(i));
        }
        return result;

    }
}

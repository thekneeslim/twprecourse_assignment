package com.company;
import java.util.List;
import java.util.ArrayList;


/**
 * Created by hiko_seijuro1000 on 6/2/17.
 */
public class Factor {
    public void findFactors(int arg) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 2; i <= arg; i++) {
            if (arg%i == 0) {
                answer.add(i);
                arg = arg/i;
            }
        }
        System.out.print(answer);
    }
}

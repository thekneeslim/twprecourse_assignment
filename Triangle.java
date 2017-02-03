package com.company;

/**
 * Created by hiko_seijuro1000 on 1/2/17.
 */
public class Triangle {
    public void horizontalLine(int arg) {
        for (int i = 0; i < arg; i++) {
            System.out.print("*");
        }
    }

    public void verticleLine(int arg) {
        for (int i = 0; i < arg; i ++) {
            System.out.println("*");
        }
    }

    public void rightTriangle(int arg) {
        int number = 1;
        String answer = "";
        for (int i = 0; i < arg; i++) {
            answer += "*";
            System.out.println(answer);
        }
    }



}

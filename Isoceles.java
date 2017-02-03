package com.company;

/**
 * Created by hiko_seijuro1000 on 3/2/17.
 */
public class Isoceles {
    public void isocelesTriangle(int arg) {
        int spacing = defineSpacing(arg);
        ascendingLines(spacing, arg);
    }

    public void diamond(int arg) {
        int spacing = defineSpacing(arg);
        ascendingLines(spacing, arg);
        descendingLines(arg);
    }

    public void diamondName(int arg, String name) {
        int spacing = defineSpacing(arg);
        ascendingLines(spacing, arg-1);
        System.out.println(name);
        descendingLines(arg);
    }

    public int defineSpacing (int arg) {
        int max = (arg - 1) * 2 + 1;
        int spacing = (max - 1) / 2;
        return spacing;
    }

    public void ascendingLines(int spacing, int arg) {
        for (int x = 0; x < arg; x++) {
            int asterix = (x) * 2 + 1;
            this.justifiedAstrix(spacing, asterix);
            spacing--;
        }
    }

    public void descendingLines(int arg) {
        int spacing = 1;
        for (int z = arg-2; z >=0; z--) {
            int asterix = (z) * 2 + 1;
            this.justifiedAstrix(spacing, asterix);
            spacing++;
        }
    }

    public void justifiedAstrix(int space, int asterix) {
        String answer = "";
        answer = this.addingSpace(answer, space);
        answer = this.addingAsterix(answer, asterix);
        answer = this.addingSpace(answer, space);
        System.out.println(answer);
    }

    public String addingSpace(String answer, int space) {
        int count = 0;
        for (int i = 0; i < space; i++) {
            answer += " ";
            count++;
        }
        return answer;
    }

    public String addingAsterix(String answer, int asterix) {
        for (int i = 0; i < asterix; i++) {
            answer +="*";
        }
        return answer;
    }
}

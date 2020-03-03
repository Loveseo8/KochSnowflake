package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        long n = in.nextLong();

        if (n > 50) {
            n = 50;
        }

        double s = 1;
        double num = 3;
        double s_add = 1;

        while (n > 1){
            s_add /=  9;
            s +=  num * s_add;
            num *= 4;
            n -= 1;
        }

        out.print(s);
    }
}

package com.company;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        while (!StdIn.isEmpty()) {
            String value = StdIn.readString();
            StdOut.println(value);
        }
        StdOut.println(args[0]);
       /* String champion = StdIn.readString();
        int i = 2;
        while (!StdIn.isEmpty()) {
            String contender = StdIn.readString();
            if (StdRandom.bernoulli(1.0 / (double) i)) {
                champion = contender;
            }
            i++;
        }
        StdOut.println(champion);*/
    }
}

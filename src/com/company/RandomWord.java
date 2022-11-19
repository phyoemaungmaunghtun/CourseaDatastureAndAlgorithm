package com.company;

import edu.princeton.cs.algs4.Knuth;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        while (!StdIn.isEmpty()){
            System.out.println("Hello");
        }

        /*if (StdIn.isEmpty()) {
            return;
        }*/
        // read in the data
        //String a = StdIn.readString();

        //Knuth.shuffle(a);

        /*int champion = 0;
        int probability = 0;

        // print results.
        for (int i = 0; i < a.length; i++) {
            int p =  1 / i;
            if (probability < p && StdRandom.bernoulli(p)) {
                champion = i;
                probability = p;
            }
        }

        StdOut.println(a[champion]);*/
    }
}

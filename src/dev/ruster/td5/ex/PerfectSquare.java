package dev.ruster.td5.ex;

import java.util.Scanner;

public record PerfectSquare(Scanner scan) {

    public PerfectSquare(Scanner scan) {
        this.scan = scan;

        System.out.println((perfectSquare(16)));
        System.out.println();
    }

    public int perfectSquare(int n) {
        return Math.sqrt(n) % 1 == 0 ? (int) Math.sqrt(n) : -1;
    }
}
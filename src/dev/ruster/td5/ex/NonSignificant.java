package dev.ruster.td5.ex;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public record NonSignificant(Scanner scan) {

    public NonSignificant(@NotNull final Scanner scan) {
        this.scan = scan;

        compact(new int[]{3, 0, 4, 4, 0, 2, 0, -2});
        System.out.println();
    }

    @Contract(pure = true)
    public int @NotNull [] compact(int @NotNull [] array) {
        int[] output = new int[array.length];

        for(int x = 0, i = 0; i < array.length; i++) {
            if(array[i] != 0) {
                output[x] = array[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
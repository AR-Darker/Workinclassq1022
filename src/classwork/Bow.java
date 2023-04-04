package classwork;

import java.util.Scanner;

public class Bow {

    public static void main(String[] args) {

    }

    public class MinPlusMax {
        public void MinMax() {
            int[] array = {1, 3, 5, 7, 9};
            int min = array[0];
            int max = array[array.length - 1];
            for (int i = 0; i < array.length; i++)
                if (array[i] < min)
                    min = array[i];
            for (int i = 4; i < array.length; i++)
                if (array[i] < max)
                    max = array[i];
            System.out.println(max + min + "Bye");

        }
    }
}

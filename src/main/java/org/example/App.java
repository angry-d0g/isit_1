package org.example;

import java.util.ArrayList;


public class App {
    public static int search(int[][] arr, int i1, int j1) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((i == i1) && (j == j1)) {
                    return arr[i][j];
                }
            }
        }
        return -1;
    }
}

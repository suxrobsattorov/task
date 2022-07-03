package com.company;

/**
 * @author Suxrob Sattorov, Sun 1:30 PM. 7/3/2022
 */
public class task1 {
    public static void main( String[] args ) {

        int count = 0;

        int[][] mas = {
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
        };

        for ( int i = 0; i < 7; i++ ) {
            for ( int j = 0; j < 7; j++ ) {
                if ( mas[i][j] == 1 ) {
                    count += Math.abs(i - mas.length / 2) + Math.abs(j - mas.length / 2);
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

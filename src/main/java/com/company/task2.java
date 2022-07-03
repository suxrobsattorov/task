package com.company;

import java.util.Scanner;

/**
 * @author Suxrob Sattorov, Sun 1:46 PM. 7/3/2022
 */
public class task2 {

    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");

        int n = sc.nextInt();
        long multiplication = 1;
        int nullCount = 0;

        for ( int i = 0; i <= n; i++ ) {
            if ( prime(i) != 0 )
                multiplication *= prime(i);
        }
        System.out.println(multiplication);
        while ( multiplication % 10 == 0 ) {
            nullCount++;
            multiplication /= 10;
        }

        System.out.println(nullCount);

        sc.close();
    }

    public static int prime( int n ) {

        if ( n <= 1 ) {
            return 0;
        } else {
            for ( int i = 2; i <= n / 2; i++ ) {
                if ( (n % i) == 0 ) {
                    return 0;
                }
            }
            return n;
        }
    }
}

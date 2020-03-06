package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testOddness();
        keepContained();
        lastDigit();
    }

    public static void testOddness() {
    Scanner testOddness;
    testOddness = new Scanner(System.in);
            
    System.out.println("Give me a number that is positive");

int number = testOddness.nextInt();

System.out.println(number + " is odd: " +(number % 2 !=0 ));


    }
    public static void keepContained() {
    int number;
    Scanner keepContained;
    keepContained = new Scanner(System.in);

System.out.println("Give me a positive number");
number = keepContained.nextInt();

System.out.println(" number contained is ");
System.out.println((number%8)+5);





    }
    public static void lastDigit() {
        int number;
        Scanner lastDigit;
        lastDigit = new Scanner(System.in);

        System.out.println("Give me a positive number that is only 4 digits long");
        number = lastDigit.nextInt();

        System.out.println("The last number digit is: " +(number%10));








    }

    }

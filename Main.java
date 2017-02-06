package com.company;

public class Main {

    public static void main(String[] args) {
	// Assignment 1
        System.out.println("----- ASSIGNMENT 1 -----");
        System.out.println("*");

    // Assignment 2
        System.out.println("----- ASSIGNMENT 2 -----");
        Triangle assignment2 = new Triangle();
        assignment2.horizontalLine(3);
        System.out.println();

    // Assignment 3
        System.out.println("----- ASSIGNMENT 3 -----");
        Triangle assignment3 = new Triangle();
        assignment3.verticleLine(3);

    // Assignment 4
        System.out.println("----- ASSIGNMENT 4 -----");
        Triangle assignment4 = new Triangle();
        assignment4.rightTriangle(4);

    // Assignment 5
        System.out.println("----- ASSIGNMENT 5 -----");
        Isoceles assignment5 = new Isoceles();
        assignment5.isocelesTriangle(4);

    // Assignment 6
        System.out.println("----- ASSIGNMENT 6 -----");
        Isoceles assignment6 = new Isoceles();
        assignment6.diamond(3);

    // Assignment 7
        System.out.println("----- ASSIGNMENT 7 -----");
        Isoceles assignment7 = new Isoceles();
        assignment6.diamondName(3, "Denise");

    // Assignment 8
        System.out.println("----- ASSIGNMENT 8 -----");
        FizzBuzz assignment8 = new FizzBuzz();
        assignment8.fizzBuzz(100);

    // Assignment 9
        System.out.println("----- ASSIGNMENT 9 -----");
        Factor assignment9 = new Factor();
        assignment9.findFactors(30);
    }


}

package com.bridgelabz;

import java.util.Scanner;

public class LinkedListMain {

    public static void main(String[] args) {
        System.out.println("Welcome to linkedList DataStructure Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to add the data at the start"); // UC 2
        System.out.println("Enter 2 to add the data at the End"); // UC 3
        switch (scanner.nextInt()) {

            case 1:
                Operations.addDataAtStart();
                break;
            case 2:
                Operations.addDataAtEnd();
                break;
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamainclass;

import java.util.Scanner;
public class divisionForLoop {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        double result = 0.0; // Initialize the result to 0

        System.out.println("Enter five numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            double number = scanner.nextDouble();
            
            if (i == 0) {
                // For the first number, assign it directly to the result
                result = number;
            } else {
                // For subsequent numbers, divide the result by the current number
                if (number == 0) {
                    System.out.println("Division by zero is not allowed.");
                    // Exit the program if division by zero is encountered
                    System.exit(1);
                }
                result /= number;
            }
        }

        System.out.println("The result of dividing the five numbers is: " + result);

        // Close the scanner to free up resources
        scanner.close();
    }
}
       


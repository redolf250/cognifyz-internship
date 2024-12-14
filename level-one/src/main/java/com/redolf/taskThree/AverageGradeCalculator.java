package com.redolf.taskThree;

import java.util.Scanner;

public class AverageGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of grades: ");
        int numOfGrades = scanner.nextInt();

        if (numOfGrades <= 0) {
            System.out.println("Invalid number of grades. Please enter a positive number.");
            return;
        }
        double sum = 0;
        for (int i = 1; i <= numOfGrades; i++) {
            System.out.print("Enter grade " + i + ": ");
            double grade = scanner.nextDouble();
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                i--;
                continue;
            }
            sum += grade;
        }
        double average = sum / numOfGrades;
        System.out.printf("The average grade is: %.2f%n", average);
        scanner.close();
    }
}

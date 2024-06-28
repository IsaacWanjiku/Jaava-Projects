package java;

import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int[] marks = new int[numSubjects];
        int sum = 0;
        
        // Input marks
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }
        
        // Calculate average
        double average = (double) sum / numSubjects;
        
        // Determine grade
        char grade = 'E';
        if (average >= 70 && average <= 100) {
            grade = 'A';
        } else if (average >= 60 && average < 70) {
            grade = 'B';
        } else if (average >= 50 && average < 60) {
            grade = 'C';
        } else if (average >= 40 && average < 50) {
            grade = 'D';
        }
        
        // Display results
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        
        // Close the scanner
        scanner.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Zbook
 */
public class OopLab4Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your numeric grade (out of 100): ");
        int grade = sc.nextInt();

        if (grade < 0) {
            System.out.println("Error: Number cannot be negative!");
        } else if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 70) {
            System.out.println("Grade: B");
        } else if (grade >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
    
    
}

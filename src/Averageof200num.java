
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Zbook
 */
public class Averageof200num {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double sum = 0;
        int count = 200;
        
        System.out.println("Enter 200 Numbers");
               
        for (int i=1; i <= count; i++){
            System.out.print("Enter Number"+ i +":");
            double num = sc.nextDouble();
            sum += num;
        }
        double average = sum /count;
        
        System.out.println("\n The average of the 200 number is : + average");
        sc.close();
        
        }        
}

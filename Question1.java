/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scanner = new Scanner(System.in); 
    
        System.out.println("Enter the number of car accidents for Cape Town: ");
        int car = scanner.nextInt();
        
        System.out.println("Enter the number of motor bike accidents for Cape Town: ");
        int bike = scanner.nextInt();
        
        System.out.println("Enter the number of car accidents for Johannesburg:");
        int car1 = scanner.nextInt();
        
        System.out.println("Enter the number of motor bike accidents for Johannesburg: ");
        int bike1 = scanner.nextInt();
        
        System.out.println("Enter the number of car accidents for Port Elizabeth: ");
        int car2 = scanner.nextInt();
        
        System.out.println("Enter the number of motor bike accidents for Port Elizabeth: ");
        int bike2 = scanner.nextInt();
        
        int[][] accidents = {
            {car, bike}, // CPT
            {car1, bike1}, // JHB
            {car2, bike2}  // PE
        };
       
        int highestAccidents = Integer.MIN_VALUE;
        int lowestAccidents = Integer.MAX_VALUE;
        
         for (int i = 0; i < accidents.length; i++) {
            for (int j = 0; j < accidents[i].length; j++) {
                int total = accidents[i][j];
                if (total > highestAccidents) {
                    highestAccidents = total;
                }
                if (total < lowestAccidents) {
                    lowestAccidents = total;
                }
            }
        }
        
        System.out.println("*********************************************************************");
        System.out.println("\t\t\t ROAD ACCIDENT REPORT");
        System.out.println("*********************************************************************");
 
        String[] cities = {"JHB", "CPT", "PE"};
        String[] vehicles = {"Car", "Motorbike"};
        
         System.out.print("\t\t");
        for (String vehicle : vehicles) {
            System.out.print(vehicle + "\t");
        }
        System.out.println();
        
         for (int i = 0; i < accidents.length; i++) {
            System.out.print(cities[i] + "\t");
            for (int j = 0; j < accidents[i].length; j++) {
                System.out.print(accidents[i][j] + "\t");
            }
            System.out.println();
        }

        // Print the statistics
        System.out.println("*********************************************************************");
        System.out.println("\t\t\t Road Accident Totals for each city.");
        System.out.println("*********************************************************************");
        System.out.println("Cape Town: " + car);
        System.out.println("Johannesburg: " + car1);
        System.out.println("Port Elizabeth: " + car2);
        System.out.println("City with the most vehicle accidents: " + highestAccidents);
        
        System.out.println("*********************************************************************");
    }
    
}

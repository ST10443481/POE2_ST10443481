/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe2_st10443481;
import javax.swing.JOptionPane;
/**
 *
 * @author lab_services_student
 */
public class Task1 {


public class Tasks
{
    // Validates that description is less than 50 characters
    public boolean checkTaskDescription(String D1)
    {
        boolean Description = true;
        if (D1.length() > 50 ){
            Description = false;
        }
        return Description;
    }   
    
    //Task ID Creation
    public String createTaskID(String Name, int Num, String Dev)
    {
        String ID = "";
            ID = Name.substring(0, 2) + ":" + Integer.toString(Num) +":" + Dev.substring(Math.max(Dev.length()-3, 0));
        return ID.toUpperCase();
    }
    
    // JOptionPane to display each individual Task
    public String printTaskDetails(String Stat,String Dev1, int Num1, String Name1, String Descripion1, String ID_1, int Hrs )
    {
        String ID = "\tTask " + (Num1 + 1) + "\nTask Status: " + Stat + "\nDeveloper Details: " + Dev1 + "\nTask Number: " + Integer.toString(Num1)
            + "\nTask Name: " + Name1 + "\nTask Description: " + Descripion1 + "\nTask ID: " + ID_1 + "\nDuration : " + Hrs + "hrs";
        return ID;
    }
    
    // Calculate the Total Duration of the tasks
    public int returnTotalHours(int tDuration,int tHour)
    {
        tDuration = tDuration + tHour;
        return tDuration;
    }
    
      //Validate any Numeric String
      //Additional personal validation 
    public String NumericValid(String input,String display){
        boolean test = false;
        while(!test){
            test = true;   
            input = JOptionPane.showInputDialog(display);
            for(int j = 0; j < input.length();j++)    // Loop to check if the whole string is an integer            
                if(!Character.isDigit(input.charAt(j))){
                test = false;
                }
                                
            if (!test){
                JOptionPane.showMessageDialog(null,"Invalid input.\nPlease enter a Numeric value.");
            }
        }
        return input;
    }
}

}
    


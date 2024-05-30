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
public class Part2_EasyKanban {
    
    int taskCount = 0;
    int taskDuration = 0;
    public static void main(String [] args)
    {        
        Part2_EasyKanban main = new Part2_EasyKanban();
        main.MenuMain();
    }  
    
    public void MenuMain(){
        String sOption = "";
        JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
    //JOptionPane that shows the 3 choices and what happens if an invalid option is picked
        while(!(sOption.equals("3")))
        {
            sOption = JOptionPane.showInputDialog(null,"Please select of the numbers below" +
            "\nOption 1)Add task\nOption 2)Show report\nOption 3)Quit");
            
            switch(sOption)
            {
              case "1": 
                  AddTask();
                  break;
              case "2": 
                  JOptionPane.showMessageDialog(null,"Coming Soon"); 
                  break;
              case "3":
                  JOptionPane.showMessageDialog(null,"Thank you for using EasyKanban.\nCome back soon!"); 
                  break;
              default:
                  JOptionPane.showMessageDialog(null,"Invalid choice. Please choose one of numbers shown.");
                  break;
            }
        }
    }
    
    public void AddTask()
    {
        
       Task1 task = new Task1();
        
        //Enter numbers of tasks
        String no_Task = "1";
        no_Task = task.NumValid(no_Task,"How many tasks do you wish to enter?");
              
        //For loop to collect Task Data
        for (int i= 0; i < Integer.parseInt(no_Task); i++){
            
            String taskName = JOptionPane.showInputDialog("Please enter name Task that is to be performed");
            
            // Description of task
            String taskDescript = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters.");
            
            while(task.checkTaskDescription(taskDescript) == false){
                               
                taskDescript = JOptionPane.showInputDialog(null,"Please make sure you enter a task description of less than 50 characters.");
            }
            JOptionPane.showMessageDialog(null,"Task successfully captured.");
            
            
            String devFirst = JOptionPane.showInputDialog("Please enter the Developer's First Name.");
            String devLast = JOptionPane.showInputDialog("Please enter the Developer's Last Name.");  
            
            // Duration of Task in hours
            String TaskDur;
            TaskDur = task.NumValid(no_Task,"Enter estimated duration of the task in hours.");
            
            taskDuration = task.returnTotalHours(taskDuration,Integer.parseInt(TaskDur));
            
            // Task Status = to do, doing or done
            String taskStatus = "";
            String status = "";
            while (!(status.equals("1") || status.equals("2")|| status.equals("3"))){
                status = JOptionPane.showInputDialog(null,"Please select one of the numbers below to show the status of the task." +
                "\n1.To Do\n2.Done\n3.Doing");
                
                if(!status.equals("1"))
                     if (status.equals("2")){
                    taskStatus = "Done";}
                else if (status.equals("3")){
                    taskStatus = "Doing";}
                else {
                    JOptionPane.showMessageDialog(null,"Invalid Choice. Please choose one of the provided options.");}
                    else {
                    taskStatus = "To Do";    
                }    
            }
             
            
            // Print Task Details         
            JOptionPane.showMessageDialog(  null,   task.printTaskDetails(taskStatus,(devFirst + " " + devLast),taskCount
            ,taskName,taskDescript,(  task.createTaskID(taskName, taskCount, devFirst)    ),Integer.parseInt(TaskDur)) + 
            "\n\nTotal Duration of All Tasks: " + taskDuration + "hrs");
            
            
            
            //Task Count
            taskCount++;
            
    }
      //System.out.println("Total Duration of All Tasks: " + taskDuration + "hrs");
    }
}
 


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
    
    Test test = new Test();

    int taskCount = 0; // taskCount (variable) is initialized to zero
    int taskDuration = 0; 
    int arraycount = 1;
    // taskDuration (variable) is initialzed to zero
    //Declare and Initialize the Arrays
    String[] devArr = new String[1];
    String[] tasknArr= new String[1];
    String[] taskIDArr= new String[1];
    int [] durArr = new int[1];
    String[] statusArr = new String[1];
    
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
            
            switch(sOption) //Switch to execute the code block when a certain condition is met (one of the "menu" options is chosen).
            {
              case "1":
                  AddTask();
                  break;
              case "2": 
            //Part 3
            // initializing the array      
            int arrayCount = 1;
            devArr = new String[arrayCount];
            tasknArr = new String[arrayCount];
            taskIDArr = new String[arrayCount];
            durArr = new int[arrayCount];
            statusArr = new String[arrayCount];
            
            boolean variable = false;
            
            if (taskDuration > 0)
               {variable = true;}
            
            while (variable) {
                  String search = "";
                  String[] options = { "Done Task", "Longest Task", "Search a Task", "Search Developer's Task", "Delete Task", "Display Report","Exit" };
           
                int selection = JOptionPane.showOptionDialog(null, "Select one of options below:", "",0, 3, null, options, options[0]);
            //https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Javas-JOptionPane-showOptionDialog-by-Example
          
            if (selection == 0) {
            //Tasks with the status "Done"
                JOptionPane.showMessageDialog( null, test.doneTask(arrayCount,devArr,tasknArr, durArr, statusArr));
            }
            if (selection == 1) {
            //Task with the longest Duration
                JOptionPane.showMessageDialog( null,test.longestDuration(devArr, durArr, arrayCount));
            }
            if (selection == 2) {
            //Search for a specific Developer's Tasks
                search = JOptionPane.showInputDialog(null,"Please enter task name");
                JOptionPane.showMessageDialog( null,test.searchTask(search, arrayCount,tasknArr, devArr, statusArr));
            }
            if (selection == 3) {
            //Search for a Task
                search = JOptionPane.showInputDialog(null,"Please enter Dev name");
                JOptionPane.showMessageDialog( null,test.searchDev(search, arrayCount, tasknArr, devArr, statusArr));
            }
            if (selection == 4) {
            //Delete specific Task
                search = JOptionPane.showInputDialog(null,"Please the Task name of the taks you wish to Delete");
                if (test.deleteTask(search, arrayCount, tasknArr, devArr, statusArr, taskIDArr, durArr))
                {
                    JOptionPane.showMessageDialog( null,"Entry '"+ search +"' successfully deleted");
                }
                else{
                    JOptionPane.showMessageDialog( null,"'" + search +"' is not a valid Task");
            }
            }
            if (selection == 5) {
                JOptionPane.showMessageDialog( null,test.displayReport(arrayCount, devArr, tasknArr, durArr, statusArr, taskIDArr));
            }
            if (selection == 6) {
                variable = false;
            }
            }
            if (!variable && taskDuration == 0) {
                JOptionPane.showMessageDialog( null,"Please Add Tasks first and then come back.");
            }
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
    
    public void AddTask() //declatarion for AddTask method
    {
        
       Task1 task = new Task1();
       int arrayCount; 
        //Enter numbers of tasks
        String no_Task = "1";
        no_Task = task.NumValid(no_Task,"How many tasks do you wish to enter?");
        arrayCount = Integer.parseInt(no_Task);
        //Re-intialising Array so that number of elements match number of tasks
        devArr = new String[arrayCount];
        tasknArr = new String[arrayCount];
        taskIDArr = new String[arrayCount];
        durArr = new int[arrayCount];
        statusArr = new String[arrayCount]; 
        
        //For loop to collect Task Data
        for (int i= 0; i < arrayCount; i++){
            
            String taskName = JOptionPane.showInputDialog("Please enter name Task that is to be performed");
            
            // Description of task
            String taskDescript = JOptionPane.showInputDialog("Please enter a task description of less than 50 characters.");
            
            while(task.checkTaskDescription(taskDescript) == false){
                               
                taskDescript = JOptionPane.showInputDialog(null,"Please make sure you enter a task description of less than 50 characters.");
            }
            JOptionPane.showMessageDialog(null,"Task successfully captured.");
            
            //developer details 
            String devFirst = JOptionPane.showInputDialog("Please enter the Developer's First Name.");
            String devLast = JOptionPane.showInputDialog("Please enter the Developer's Last Name.");  
            
            // Duration of Task in hours
            String TaskDur = "1";
            TaskDur = task.NumValid(no_Task,"Enter estimated duration of the task in hours.");
            
            taskDuration = task.returnTotalHours(taskDuration,Integer.parseInt(TaskDur));
            
            // Task Status = to do, doing or done
            String taskStatus = "";
            String status = "";
            while (!(status.equals("1") || status.equals("2")|| status.equals("3"))){
                status = JOptionPane.showInputDialog(null,"Please select one of the numbers below to show the status of the task." +
                "\n1.To Do\n2.Done\n3.Doing");
                
                if(status.equals("1")){
                    taskStatus = "To Do";
                }
                else if (status.equals("2")){
                       taskStatus = "Done";
                }
                else if (status.equals("3")){
                           taskStatus = "Doing";
               
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid Choice. Please choose one of the provided options.");
                }
                  
            }
            String taskID = task.createTaskID(taskName, i, devLast);
            // Display Task Details         
            JOptionPane.showMessageDialog(  null,   task.printTaskDetails(taskStatus,(devFirst + " " + devLast),taskCount
            ,taskName,taskDescript,(task.createTaskID(taskName, taskCount, devFirst)),Integer.parseInt(TaskDur)) + 
            "\n\nTotal Duration of All Tasks: " + taskDuration + "hrs");
            
            //Populate the arrays with task data
            devArr[i] = devFirst + "" + devLast;
            tasknArr[i] = taskName;
            taskIDArr[i] = taskID;
            durArr[i] = Integer.parseInt(TaskDur);
            statusArr[i] = taskStatus;
            
            
            //Task Count/Amount of tasks
            taskCount++;
            
    }
      //System.out.println("Total Duration of All Tasks: " + taskDuration + "hrs");
    }
}
 


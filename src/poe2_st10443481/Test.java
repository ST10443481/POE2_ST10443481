/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe2_st10443481;
/**
 *
 * @author lab_services_student
 */
public class Test {

//Task with the status of done
public String doneTask(int taskCount,String[] developer,String[] taskNames,int[] taskDuration,String[] taskStatus){
int c = 0;
String display = "Completed Task";
for (int k = 0; k < taskCount; k++){
if ((taskStatus[k]).equals("Done")){
   display = display + "\nDeveloper: "+ developer[k] + "\nTask: "+ taskNames[k] +"\nDuration: " + taskDuration[k] +"hrs";
   c++;
 }
}
if (c == 0){
   display = "No Completed Tasks ";
}
return display;
}
//Display details for task with longest duration
public String longestDuration(String[] developer,int[] taskDuration,int taskCount){
String lDur = "";
int longest = 0;
for (int l = 0; l < taskCount; l++) {
if (taskDuration[l] > longest){
    longest = taskDuration[l];
    lDur = "Longest Task\nDeveloper: " + developer[l] +"\nDuration: " + taskDuration[l] +"hrs";
   }
  }
return lDur;
}
//Delete task using Task Name
public boolean deleteTask(String delete, int taskCount,String[] taskNames, String[] developer, String[] taskStatus, String[] taskID, int[] taskDuration){
boolean bDel = false;
for (int d = 0; d < taskCount; d++) {
if (delete.equals(taskNames[d])){
taskNames[d] = "";
developer[d] = "";
taskStatus[d] = "";
taskID[d] = "";
taskDuration[d] = 0;
bDel = true;
}
}
return bDel;
}
//Search Array for tasks assigned to developer
public String searchDev(String search, int taskCount,String[] taskNames, String[] developer, String[] taskStatus){
int c = 0;
String display = "Tasks by: "+ search;
for (int s = 0; s < taskCount; s++){
if (search.equals(developer[s]) ){
display= display + "\nTask: "+ taskNames[s] +"\nStatus: " + taskStatus[s];
c++;
}
}
if (c == 0){
display = "No task by '"+ search +"' found.";
}
return display;
}
//Search Array for tasks using Task Name
public String searchTask(String search, int taskCount,String[] taskNames, String[] developer, String[] taskStatus){
String display = "Task (" + search + ") not found.";
for (int t = 0; t < taskCount; t++){
if (search.equals(taskNames[t]) ){
display = "Task: "+ taskNames[t] + "\nDeveloper: "+ developer[t] +"\nStatus: " + taskStatus[t];
}
}
return display;
}
//Display Task Report
public String displayReport(int taskCount, String[] developer,String[] taskNames, int[] taskDuration, String[] taskStatus, String[] taskID){
String display = "";
for (int c = 0; c< taskCount; c++){
if (!("".equals(taskNames[c]))){
display = display + "Task " +(c+1)+"\nDeveloper: " + developer[c] + "\nTask Name: " + taskNames[c] + "\nTask ID: " + taskID[c] +
"\nTask Duration: "+ taskDuration[c]+ "\nTask Status: "+ taskStatus[c] +"\n\n";
}
}
if ("".equals(display)){
display = "No Data to display";
}
return display;
}
}    


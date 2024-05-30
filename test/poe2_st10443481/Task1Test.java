/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe2_st10443481;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
/**
 *
 * @author lab_services_student
 */
public class Task1Test {
    
Task1 task = new Task1();

    @Test
    public void testcheckTaskDescription() 
    {
   boolean expected = true;
    boolean result = task.checkTaskDescription("wjudhwhd");
    
    assertEquals(expected, result);

   
    }
    @Test
   public void testcreateTaskID()
    {   
    String taskID = task.createTaskID("Login feature", 1, "Robyn Harrison");
    assertEquals("LO:1:SON", (taskID));
        System.out.println(taskID);

      
    }
   
    @Test
    public void testreturnTotalHours()
    {
        Task1 task1=new Task1();
        
        int [] hours1 = {8,10};
        int expectedTotalHours1 = 18;
        
        for (int duration: hours1)
        {
            task1.returnTotalHours(0,0);
        }
        
        int actualTotalHours = task1.returnTotalHours(8,10);
        assertEquals(expectedTotalHours1, actualTotalHours);
        System.out.println("Total combined hours of all tasks: " + actualTotalHours + " hours");
        
        Task1 t1 = new Task1();
      
        
        int [] hours2 = {10,12,55,11,1};
        int expectedTotalHours2 = 89;
        
        for (int duration: hours2)
        {
            t1.returnTotalHours(0,0);
        } 
        int actualTotalHours2 = t1.returnTotalHours(10,12) + t1.returnTotalHours(55,11) + t1.returnTotalHours(1,0);
        assertEquals(expectedTotalHours2, actualTotalHours2);
        
        System.out.println("Total combined hours for all tasks: " + actualTotalHours2 + " hours");
    }
     
}

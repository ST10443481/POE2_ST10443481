/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe2_st10443481;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 *
 * @author lab_services_student
 */
public class TestTest {
    
    public TestTest() 
    {
      Test test = new Test();   
    }

    @Test
    public void testDoneTask() {
        
    }

    @Test
    public void testLongestDuration() {
    }

    @Test
    public void testDeleteTask() {

        // Test the deleteTask method
        String[] developers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        int[] taskDurations = {5, 8, 2, 11};
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};
        String[] taskIDs = {"CR:1:ITH", "CR:2:TON", "CR:3:SON", "CR:4:ZER"};
       
        String expected="Succesfully deleted ";
        boolean result = test.deleteTask("Create Reports", 4, taskNames, developers, taskStatuses, taskIDs, taskDurations);

     
        assertEquals("", taskNames[2]); // Assuming taskNames is cleared upon deletion
        assertEquals("", developers[2]); // Assuming developers is cleared upon deletion
        assertEquals("", taskStatuses[2]); // Assuming taskStatuses is cleared upon deletion
        assertEquals("", taskIDs[2]); // Assuming taskIDs is cleared upon deletion
        assertEquals(0, taskDurations[2]); // Assuming taskDurations is set to 0 upon deletion
       
        System.out.println(expected);
    }

    @Test
    public void testSearchDev() {
      // Test the doneTask method
        String[] developers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        int[] taskDurations = {5, 8, 2, 11};
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};

        String expected = "Completed Task\nDeveloper: Samantha Paulson\nTask: Create Reports\nDuration: 2hrs";
        String result = test.doneTask(4, developers, taskNames, taskDurations, taskStatuses);

        assertEquals(expected, result);
        System.out.println(expected);  
    }

    @Test
    public void testSearchTask() {
        // Test the searchDev method
        String[] developers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};

        String expected = "Tasks by: Mike Smith\nTask: Create Login\nStatus: To Do";
        String result = test.searchDeveloper("Mike Smith", 4, taskNames, developers, taskStatuses);

        assertEquals(expected, result);
        System.out.println(expected);
    }

    @Test
    public void testDisplayReport() {
          // Test the displayReport method
        String[] developers = {"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        String[] taskNames = {"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        int[] taskDurations = {5, 8, 2, 11};
        String[] taskStatuses = {"To Do", "Doing", "Done", "To Do"};
        String[] taskIDs = {"CR:1:ITH", "CR:2:TON", "CR:3:SON", "CR:4:ZER"};

        String expected = "Task 1\nDeveloper: Mike Smith\nTask Name: Create Login\nTask ID: CR:1:ITH\nTask Duration: 5\nTask Status: To Do\n\n" +
                          "Task 2\nDeveloper: Edward Harrison\nTask Name: Create Add Features\nTask ID: CR:2:TON\nTask Duration: 8\nTask Status: Doing\n\n" +
                          "Task 3\nDeveloper: Samantha Paulson\nTask Name: Create Reports\nTask ID: CR:3:SON\nTask Duration: 2\nTask Status: Done\n\n" +
                          "Task 4\nDeveloper: Glenda Oberholzer\nTask Name: Add Arrays\nTask ID: CR:4:ZER\nTask Duration: 11\nTask Status: To Do\n\n";
        String result = test.displayReport(4, developers, taskNames, taskDurations, taskStatuses, taskIDs);

        assertEquals(expected, result);
        System.out.println(expected);
    }
    
}

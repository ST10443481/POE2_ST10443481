/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe2_st10443481;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class POE2_ST10443481 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    String Username = null;
    String FirstName;
    String LastName;
    String Password = null;
 
    Login1 a = new Login1();
    Login1 b = new Login1();
// Enter first name + last name   

   FirstName = JOptionPane.showInputDialog(null,"Please enter your first name");
   LastName = JOptionPane.showInputDialog(null,"Plaese enter your last name");

boolean test1 = false;   
while(test1 != true)
{
    
    // Enter Username

    Username = JOptionPane.showInputDialog(null,"Please enter username");
      
   
    //Username must contain an underscore

    if (Username.length() <= 5 && Username.contains("_"))
    {
         JOptionPane.showMessageDialog(null,a.checkUserName(Username));
         test1 = true;
    }
    else 
    {
        JOptionPane.showMessageDialog(null,"Error: Username can not be greater than 5 characters and must contain an underscore.");
    }
        

}
 
boolean test2 = false;   
while(test2 != true)//test comment
{
    // Enter Password
       Password = JOptionPane.showInputDialog(null,"Please enter password");
    
 
    // Pasword must contain Capital letter, a number + special character
     
    char password = 'A';
    boolean isUpper = Character.isUpperCase(password);
   
    char di = '5';
    boolean isDigit = Character.isDigit(di);
     
    char specialChar = '#';
    boolean special = Character.isJavaIdentifierPart(specialChar);
   
    
    
    if (Password.length()>=8)
    {
        JOptionPane.showMessageDialog(null,b.checkPasswordComplexity(Password));
        test2 = true;
    }    
    else 
    {
        JOptionPane.showMessageDialog(null,"Password must cannot contain: \nAt least 8 characters.\nMust have a digit \nA special character.");     
    }
        
    

    // login using previously entered Username + Password  
       
 JOptionPane.showMessageDialog(null,"Login");
 JOptionPane.showMessageDialog(null,"Hello User \nPlease enter your login details");

String logUsername = Username;    
 
boolean test3 = false;   
while(test3 != true)
{ 
    
    if (logUsername.equals(JOptionPane.showInputDialog(null,"Please enter username")))
    { 
        JOptionPane.showMessageDialog(null,"Username correct.");
        test3 = true;
    }
    else
    { 
        JOptionPane.showMessageDialog(null,"Username is incorrect. \nPlease try again.");
    }
       
}

boolean test4 = false;   
while(test4 != true)
{
    
    String logPassword = Password;

 if (logPassword.equals(JOptionPane.showInputDialog(null,"Please enter password")) && logUsername.equals(Username)){
     JOptionPane.showMessageDialog(null,"Password correct.");
     JOptionPane.showMessageDialog(null,"Welcome " + FirstName + " " + LastName + " it is great to see you again.");
     Part2_EasyKanban p2 = new Part2_EasyKanban();
     test4 = true;
     p2.MenuMain();
    }else{ 
     JOptionPane.showMessageDialog(null,"Username or password is incorrect, please try again.");
     JOptionPane.showMessageDialog(null,"false");
 }
}   
}
}  
}   


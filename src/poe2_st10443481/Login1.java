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
public class Login1 {
     public boolean checkUserName (String Username)
    {
        if(Username.length() <= 5 && Username.contains("_"))
           JOptionPane.showMessageDialog(null, "Username succesfully captutred.");
        
else {
            JOptionPane.showMessageDialog(null, "Please ensure that your username has an underscore and has no more than 5 characters");
            
        }
        return true;
}
public boolean checkPasswordComplexity(String Password){
    if(Password.length()<=8){
       JOptionPane.showMessageDialog(null, "Password succesfully captured.");
    
    boolean isUpper = true;
    boolean isDigit = true;
    boolean special = true;
    
    for(char c: Password.toCharArray()){
        if(Character.isUpperCase(c)){
            isUpper = true;
        }
        else if (!Character.isLetterOrDigit(c)){
            special = true;
        }
        else if (Character.isDigit(c)){
           isDigit = true;
        }
         return isUpper && isDigit && special;
    }
    }
    return true;
}    

public String registerUser(String Username, String Password){
    if (Username.equals(Username)){
        JOptionPane.showMessageDialog(null, "Correct format for username");
    }
    else {
        JOptionPane.showMessageDialog(null, "Incorrect format for username");
    }
    if (Password.equals(Password)){
        JOptionPane.showMessageDialog(null, "Password meets requirements");
        
}else { JOptionPane.showMessageDialog(null, "Password doesn't meet complexity requirements.");
    }
    if(Username.equals(Username) && Password.equals(Password)){
       JOptionPane.showMessageDialog(null, "User has been registered successfully."); 
    }else {
        JOptionPane.showMessageDialog(null, "User has not met complexity requirements and not been registered.");
    }
    return null;
}

public String loginUser(String User){
    String User1 = "User1";
    String User2 = "User2";
boolean isLogin = User1.equals(User2);
return User;
}
public boolean returnLoginStatus(String Username, String Password){
    if(Username.equals(Username) && Password.equals(Password))
    {
        JOptionPane.showMessageDialog(null, "Login successful");
        return true;
    } else
    {
        JOptionPane.showMessageDialog(null, "Login failed");
        return false;
}
}

}

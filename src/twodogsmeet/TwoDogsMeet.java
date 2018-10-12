/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodogsmeet;
import javax.swing.*;
/**
 *
 * @author Hildana
 */
public class TwoDogsMeet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int inputChoiceA1, inputChoiceH1, inputChoiceA2, inputChoiceH2;
    
    //ask name
    JOptionPane.showMessageDialog(null, "Input first dog's name");    
    String inputName1 = JOptionPane.showInputDialog("Please enter name");
    
    JOptionPane.showMessageDialog(null, "Input second dog's name");    
    String inputName2 = JOptionPane.showInputDialog("Please enter name");
    
    //ask breed
    JOptionPane.showMessageDialog(null, "Input first dog's breed");
    String inputBreed1 = JOptionPane.showInputDialog("Please enter name");
    
    JOptionPane.showMessageDialog(null, "Input second dog's breed");
    String inputBreed2 = JOptionPane.showInputDialog("Please enter name");
    
    Dog dog1 = new Dog();
    Dog dog2 = new Dog(inputName2,inputBreed2);
    
    //Prompt user to confirm or change aggression level 
    inputChoiceA1 = Integer.parseInt(JOptionPane.showInputDialog (dog1 + "\n" + "Do you want to change the level of aggression?\n" 
            + "1 = Yes\n" 
            + "2 = No"));
    
    //aggression level change for dog 1
    if (inputChoiceA1 == 1)
    {
      String inputAgg1 = JOptionPane.showInputDialog ("Please input new agression level");
    } 
    
    if (inputChoiceA1 == 2)
    {
      JOptionPane.showMessageDialog(null, "Aggression level not changed");
    } 

    //Prompt user to confirm or change hunger level
    inputChoiceH1 = Integer.parseInt(JOptionPane.showInputDialog (dog1 + "\n" + "Do you want to change the level of hunger?\n" 
            + "1 = Yes\n" 
            + "2 = No"));
    
    //hunger level change dog1
    if (inputChoiceH1 == 1)
    {
      String inputHung1 = JOptionPane.showInputDialog ("Please input new agression level");
    } 
    
    if (inputChoiceH1 == 2)
    {
      JOptionPane.showMessageDialog(null, "Hunger level not changed");
    }
    
   //dog 2  - prompt user to confirm or change aggression level 
   inputChoiceA2 = Integer.parseInt(JOptionPane.showInputDialog (dog2 + "\n" + "Do you want to change the level of aggression?\n" 
            + "1 = Yes\n" 
            + "2 = No")); 
        
   //aggression level change for dog 2
    if (inputChoiceA2 == 1)
    {
      String inputAgg2 = JOptionPane.showInputDialog ("Please input new agression level");
    } 
    
    if (inputChoiceA2 == 2)
    {
      JOptionPane.showMessageDialog(null, "Aggression level not changed");
    }     
        
    //dog2 - Prompt user to confirm or change hunger level
    inputChoiceH2 = Integer.parseInt(JOptionPane.showInputDialog (dog2 + "\n" + "Do you want to change the level of hunger?\n" 
            + "1 = Yes\n" 
            + "2 = No"));
    
    //hunger level change dog2
    if (inputChoiceH2 == 1)
    {
      String inputHung2 = JOptionPane.showInputDialog ("Please input new agression level");
    } 
    
    if (inputChoiceH2 == 2)
    {
      JOptionPane.showMessageDialog(null, "Hunger level not changed");
    }    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//    Dog dog1 = new Dog();
//    Dog dog2 = new Dog();
//    
//     //Dog 1
//     dog1.setAggression((int) (Math.random() * 10) + 1);
//     String a1 = JOptionPane.showInputDialog(
//      "Agression level for Dog1 : " + dog1.getAggression() + "\n" 
//              + "Would you like to change the agression level for the first dog?\n"
//              + "If so, Please type in a number between 1 and 10\n" 
//              + "If not, please press cancel");
//     
//     dog1.setHunger((int) (Math.random() * 10) + 1);
//     String b1 = JOptionPane.showInputDialog(
//      "Hunger level for Dog1 : " + dog1.getHunger() + "\n" 
//              + "Would you like to change the hunger level for the first dog?\n"
//              + "If so, Please type in a number between 1 and 10\n" 
//              + "If not, please press cancel");
//     
//     //Dog 2
//     dog2.setAggression((int) (Math.random() * 10) + 1);
//     String a2 = JOptionPane.showInputDialog(
//      "Agression level for Dog2 : " + dog2.getAggression() + "\n" 
//              + "Would you like to change the agreesion level for the first dog?\n"
//              + "If so, Please type in a number between 1 and 10\n" 
//              + "If not, please press cancel");
//     
//     dog2.setHunger((int) (Math.random() * 10) + 1);
//     String b2 = JOptionPane.showInputDialog(
//      "Hunger level for Dog2 : " + dog2.getHunger() + "\n" 
//              + "Would you like to change the Hunger level for the first dog?\n"
//              + "If so, Please type in a number between 1 and 10\n" 
//              + "If not, please press cancel");
    
    
   
    
     
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    
//    //Print the details of each dog
//    System.out.println("Dog 1");
//    System.out.println(dog1.toString());
//    System.out.println("--------------------------");
//    
//    System.out.println("Dog 2");
//    System.out.println(dog2.toString());
//    System.out.println("--------------------------");
//    
    }
    
}

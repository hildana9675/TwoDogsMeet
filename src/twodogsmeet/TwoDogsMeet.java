/* Hildana. M
 * TwoDogsMeet.java
 * This program determines if the two dogs meeting is friendly or not
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
    
    //ask name for dog2
    JOptionPane.showMessageDialog(null, "Input second dog's name");    
    String inputName2 = JOptionPane.showInputDialog("Please enter name");
    
    //ask breed for dog2
    JOptionPane.showMessageDialog(null, "Input second dog's breed");
    String inputBreed2 = JOptionPane.showInputDialog("Please enter name");
    
    Dog dog1 = new Dog();
    Dog dog2 = new Dog(inputName2,inputBreed2);
    
    //Prompt user to confirm or change aggression level 
    inputChoiceA1 = Integer.parseInt(JOptionPane.showInputDialog (dog1 + "\n" + "Do you want to change the level of aggression?\n" 
            + "1 = Yes\n" 
            + "2 = No"));
    
    //aggression level change for dog 1
    int newAgg1 = 0;
    
    if (inputChoiceA1 == 1)
    {
      newAgg1 = Integer.parseInt(JOptionPane.showInputDialog ("Please input new agression level between 1-10"));
      dog1.setAggression(newAgg1);
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
    int newHung1 = 0;
    
    if (inputChoiceH1 == 1)
    {
      newHung1 = Integer.parseInt(JOptionPane.showInputDialog ("Please input new hunger level between 1-10"));
      dog1.setHunger(newHung1);
    }
    
    if (inputChoiceH1 == 2)
    {
      JOptionPane.showMessageDialog(null, "Hunger level not changed");
    }
    
   //dog 2- prompt user to confirm or change aggression level 
   inputChoiceA2 = Integer.parseInt(JOptionPane.showInputDialog (dog2 + "\n" + "Do you want to change the level of aggression?\n" 
            + "1 = Yes\n" 
            + "2 = No")); 
        
   //aggression level change for dog 2
    int newAgg2 = 0;
    
    if (inputChoiceA2 == 1)
    { 
      newAgg2 = Integer.parseInt(JOptionPane.showInputDialog ("Please input new aggression level between 1-10"));
      dog2.setAggression(newAgg2);
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
     int newHung2 = 0;
    
    if (inputChoiceH2 == 1)
    {
      newHung2 = Integer.parseInt(JOptionPane.showInputDialog ("Please input new hunger level between 1-10"));
      dog2.setHunger(newHung2);
    } 
    
    if (inputChoiceH2 == 2)
    {
      JOptionPane.showMessageDialog(null, "Hunger level not changed");
    }    
        
    //two dogs meeting 
    if (dog1.getAggression() <= 5 && dog1.getHunger() <= 5 && dog2.getAggression() <= 5 && dog2.getHunger() <= 5)
    {
       JOptionPane.showMessageDialog(null, "Meeting is friendly"); 
    } else if (dog1.getAggression() > 5 && dog1.getHunger() > 5 && dog2.getAggression() > 5 && dog2.getHunger() > 5)
    {
       JOptionPane.showMessageDialog(null, "Meeting is NOT friendly"); 
    } else if (dog1.getAggression() <= 5 && dog1.getHunger() > 5 && dog2.getAggression() <= 5 && dog2.getHunger() > 5)
    {
        JOptionPane.showMessageDialog(null, "Meeting is friendly, but both dogs are hungry");
    } else if (dog1.getAggression() > 5 && dog1.getHunger() <= 5 && dog2.getAggression() > 5 && dog2.getHunger() <= 5)
    {
        JOptionPane.showMessageDialog(null, "Meeting is NOT friendly, but both dogs are NOT hungry");
    } else {
        JOptionPane.showMessageDialog(null, "Meeting is neutral");
    }
        
   
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodogsmeet;

/**
 *
 * @author Hildana
 */
public class Dog {
    
    private String dogName, dogBreed;
  private int aggression, hunger;

  //constructors
  public Dog() {
      
    dogName = "Rufus Doe";
    dogBreed = "German Shepherd";
    aggression = 0;
    hunger = 0;
    
  }

  public Dog(String dname, String dbreed) {
    
    dogName = dname;
    dogBreed = dbreed;
    aggression = (int) (Math.random() * 10) + 1;
    hunger = (int) (Math.random() * 10) + 1;
  
  }

   /*
    * This method allows the user to set the aggression of the dog
    * pre: needs an aggression value
    * post: sets the aggression value
   */
  public void setAggression (int aggres)
  {
      aggression = aggres; 
  }
  
  /*
   * This method allows the user to get the aggression of the dog
   * pre: needs an aggression value
   * post: gets the aggression value
  */
  public int getAggression ()
  {
      return aggression;
  }
  
  /*
   * This method allows the user to set the hunger of the dog
   * pre: needs an hunger value
   * post: set the hunger value
  */
  public void setHunger (int hungr)
  {
      hunger = hungr;
  }
  
  /*
   * This method allows the user to get the hunger of the dog
   * pre: needs an hunger value
   * post: gets the hunger value
  */
   public int getHunger ()
  {
      return hunger;
  } 
  
  
  

  //method to display all info of the Dog
  public String toString() {
    String output = "Name: "  + dogName +  "\n";
    output += "Breed: " + dogBreed + "\n";
    output += "Aggression: " + aggression + "\n";
    output += "Hunger: " + hunger;
    //output string is complete, return it
    return output;
    
    }
    
}

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
   * This 
   * Pre:
   * Pro:
  */
  public void setAggression (int aggres)
  {
      aggression = aggres; 
  }
  
  /*
   * This 
   * Pre:
   * Pro:
  */
  public int getAggression ()
  {
      return aggression;
  }
  
  /*
   * This 
   * Pre:
   * Pro:
  */
  public void setHunger (int hungr)
  {
      hunger = hungr;
  }
  
  /*
   * This  
   * Pre:
   * Pro:
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

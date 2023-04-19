//Write some code to store 3 objects of the dog class in an array

public class Driver {
  public static void main(String[] args) {
      // your code here
      // you should create an array that can hold 3 dog objects called dogs
      // the 0th and 2nd dogs can be generic, but the 1st dog should have a name parameter. Name this dog "Spot"
    
      System.out.println(dogs[0].getHappiness());
      System.out.println(dogs[1].getName());
      System.out.println(dogs[2].getLegs());
      System.out.println();

      dogs[0].isHappy = false;
      dogs[1].name = "Fido";
      dogs[2].legs = 3;

      System.out.println(dogs[0].getHappiness());
      System.out.println(dogs[1].getName());
      System.out.println(dogs[2].getLegs());
      System.out.println();
        
      /* expected print:
      true
      Spot
      4
      
      false
      Fido
      3
      */
   }
}

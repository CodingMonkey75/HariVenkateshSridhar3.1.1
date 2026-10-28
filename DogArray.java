/*
 * Activity 3.1.1
 */
public class DogArray
{
  public static void main(String[] args)
  {
    Dog[] myDogs = {new Dog("Lady"),
               new Dog("Tramp"),
                new Dog("Trusty")};
    Dog[] neighborsDogs = new Dog[2];
    System.out.println(myDogs[0].getName());
    System.out.println(myDogs[1].getName());
    System.out.println(myDogs[2].getName());

    neighborsDogs[0] = new Dog("Buddy");
    neighborsDogs[1] = new Dog("Daisy");

    System.out.println(neighborsDogs[0].getName());
    System.out.println(neighborsDogs[1].getName());

   // CODE TO ADD
    Dog[] friendsDogs = {new Dog("Lady"), new Dog("Tramp")};
    /*String is not compatible with Dog and cannot be converted to Dog */
    System.out.println(friendsDogs[0] + " and " + friendsDogs[1]);
    /*neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")};*/ 
    /* initializer lists are only allowed when the array is declared, not to assign values to
    existing variables*/ 
    /*neighborsDogs[2] = new Dog("Cocoa");*/ 
    /*This is out of index because neighborDogs only has two indices, 0 and 1. */
    neighborsDogs = new Dog[3];
    System.out.println(neighborsDogs[0].getName()); 
    System.out.println(neighborsDogs[1].getName()); 
    /*The .getName() method cannot be used because neighborDogs is null */
  }
}
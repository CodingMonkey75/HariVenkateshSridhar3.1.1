/*
 * Activity 3.1.1
 */
public class Partners
{
  public static void main(String[] args)
  {    
    String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    String[] partners = new String[7];
    System.out.println(partners[0]);
    partners[1] = "Jannik";
    partners[4] = "Daniil";
    partners[5] = "Alex";
    System.out.println(days[1] + ": " + partners[1]);
    System.out.println(days[4] + ": " + partners[4]);
    System.out.println(days[5] + ": " + partners[5]);
    String[] friendPartners = partners;
    System.out.println("Friend's " + days[1] + ": " + friendPartners[1]);
    System.out.println("Friend's " + days[4] + ": " + friendPartners[4]);
    System.out.println("Friend's " + days[5] + ": " + friendPartners[5]);
    
    
  }
}


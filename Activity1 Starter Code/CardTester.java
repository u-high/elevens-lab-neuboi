/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
   Card c = new Card("Diamonds", "Queen", 11);
   Card cTwo = new Card("Spades", "Ten", 1);
   Card cThree = new Card("Hearts", "Three", 3);
   
   System.out.println(c.toString());
   System.out.println(cTwo.toString()); 
   System.out.println(cThree.toString());  
   
 }
}

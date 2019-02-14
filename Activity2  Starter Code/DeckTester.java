/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

 /**
  * The main method in this class checks the Deck operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
   
   String[] ranks = {"one", "two", "three", "down"};
   String[] suits = {"int", "ref", "tower", "treep"};
   int[] val = {3, 4, 5, 6};
   
   String[] ranksT = {"you", "tube"};
   String[] suitsT = {"doub", "fred"};
   int[] valT = {7, 8};
   
   String[] ranksTh = {"twelve"};
   String[] suitsTh = {"twelve"};
   int[] valTh = {12};
   
   
   Deck f = new Deck(ranks, suits, val);
   Deck g = new Deck(ranksT, suitsT, valT);
   Deck h = new Deck(ranksTh, suitsTh, valTh);
 
 }
}

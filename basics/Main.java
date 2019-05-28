public class Main {

  public static void main (String [] args){

    //Testing Pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
  }

  //pluralize accepts a word and a number and if the number is zero or greater than one it returns a string with the word pluralized with an “s” 

  public static String pluralize (String word, int number){
    
    if (number == 0 || number > 1){
      word = word + "s";
    }
    return word;
  }


  //flipNHeads accepts an integer n and flips coins until n heads are flipped in a row.


  //clock uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. 

}
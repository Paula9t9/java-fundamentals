public class Main {

  public static void main (String [] args){

    //Testing Pluralize
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    //Testing flipNHeads
    flipNHeads(1);
    flipNHeads(2);

  }

  //pluralize accepts a word and a number and if the number is zero or greater than one it returns a string with the word pluralized with an “s” 
  public static String pluralize (String word, int number){
    
    if (number == 0 || number > 1){
      word = word + "s";
    }
    return word;
  }


  //flipNHeads accepts an integer n and flips coins until n heads are flipped in a row.
  public static void flipNHeads(int numberOfHeadsDesired){

    int headsAchieved = 0;
    int numberOfFlips = 0;
    do{
      double randomNumber = Math.random();
      numberOfFlips++;
      if (randomNumber >= 0.5f){
        headsAchieved++;
        System.out.println("Heads");
      }else {
        System.out.println("Tails");
      }

    }while (headsAchieved != numberOfHeadsDesired);

    System.out.println("It took " + numberOfFlips + " flips to flip " + numberOfHeadsDesired + " " + pluralize("head", numberOfHeadsDesired) + " in a row.");

  }


  //clock uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. 

}
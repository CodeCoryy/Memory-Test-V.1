import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


class Main {
  public static void main(String[] args) throws Exception{
    System.out.println("\nMemory Test V.1\n" );

    Scanner scan = new Scanner(System.in);
    System.out.println("Pick\n");
    System.out.println("1 -- Play\n");
    System.out.println("2 -- Instructions\n");
    int menuOption = scan.nextInt();
    clearScreen();
    

    if(menuOption == 1) { 
      int score = 0;

      String answerOne;
      System.out.println("You have 5 slices of an apple pie. Your brown dog eats 1, your dad eats 2, and then your mom eats 1. One of your red-head siblings Sia eats half of yours, and then your blonde sibling eats the other half.\n\n"); 
      TimeUnit.SECONDS.sleep(10);
      clearScreen();
      Scanner s = new Scanner(System.in);
      TimeUnit.SECONDS.sleep(2);
      System.out.println("What was the name of your red-head sibling?\n");
      answerOne = s.nextLine();
      String actualA1 = "Sia";

      if(answerOne.equals(actualA1)) {
        System.out.print("\nCorrect!");
        score += 1;
      } else {
        System.out.println("\nIncorrect");
      }
      TimeUnit.SECONDS.sleep(1);
      clearScreen();
      String answerTwo;
      System.out.println("John P. has $56.99. He buys 10 action figures at Walmart for $5.99, then realizes he was stupid for buying them. He then returns 5 of his action figures back. ");
      TimeUnit.SECONDS.sleep(7);
      clearScreen();
      TimeUnit.SECONDS.sleep(2);
      System.out.println("What was the last name initial of John?\n");
      answerTwo = s.nextLine();
      String actualA2 = "P";
      if(answerTwo.equals(actualA2)) {
        System.out.print("\nCorrect!");
        score += 1;
      }
      else {
        System.out.println("\nIncorrect!");
      }
      TimeUnit.SECONDS.sleep(1);
      clearScreen();
      String answerThree;
      System.out.println("You go on a bicycle ride with your friend TJ. Tony hated doing house chores all alone - he wanted to hang out as well.");
      TimeUnit.SECONDS.sleep(7);
      clearScreen();
      TimeUnit.SECONDS.sleep(2);
      System.out.println("What is TJ's first name? Type in the number corresponding to your answer.\n");
      System.out.println("\n1 - Tony\n");
      System.out.println("2 - Tyler\n");
      System.out.println("3 - TJ\n");
      System.out.println("4 - Not specified\n");
      answerThree = s.nextLine();
      String actualA3 = "4";
      if(answerThree.equals(actualA3)) {
        System.out.print("\nCorrect!");
        score += 1;
      }
      else {
        System.out.print("\nIncorrect!");
      }
      TimeUnit.SECONDS.sleep(1);
      clearScreen();
      String answerFour;
      System.out.println("Cory has $50.51. He buys 3 packs of swedish fish for $3. He then buys the knew 'Genshin Impact' game for $25 on Playstation. He goes to the cashier, Sally, to check out.");
      TimeUnit.SECONDS.sleep(8);
      clearScreen();
      TimeUnit.SECONDS.sleep(2);
      System.out.println("How much money did Cory intially have?\n");
      answerFour = s.nextLine();
      String actualA4 = "50.51";
      if(answerFour.equals(actualA4)) {
        System.out.print("\nCorrect!");
        score += 1;
      }
      else {
        System.out.print("\nIncorrect!");
      }
      String name;
      TimeUnit.SECONDS.sleep(1);
      clearScreen();
      System.out.println("Congratulations! You completed the Memory Test! ");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("\n\nType your name here:\n\n");
      name = s.nextLine();
      System.out.println("\nThank you " + name + " for completing this memory test.");
      System.out.println("\nYour score is " + score + "/4");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("\n\nPress 1 to retry");
    } 
    else if(menuOption == 2){
      System.out.println("\nInstructions: \n\nThe objective of the game is to memorize every important detail of the questions given. You will be given around 5 to 10 seconds to read each question and analyize it. After the time runs out, you will be given a question - and must answer it as accurately as possible.");
    }
    else {
      System.out.println("Pick the NUMBER corresponding to what action you want to do");
    }

  }
  public static void clearScreen() {
    System.out.println("\033[H\033[2J");
    System.out.flush();
  
  }
}
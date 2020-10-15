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

      if(answerOne == "Sia"); {
        System.out.print("\nCorrect!");
        score += 1;
      }

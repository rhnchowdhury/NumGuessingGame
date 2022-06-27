package game;

import java.util.Scanner;

public class NumGuess {
    public static void main(String[] args) {
        int attempt=1;
        int GuessNumByUser;
        int expectedNum=(int) (Math.random()*10)+1;
        Scanner userInput= new Scanner(System.in);
        System.out.println("Welcome to Number Guessing game \nYou will be asked to guess a number to win the game \nyou have Maximum 3 Attempt limit ");
        
        do{
            System.out.println("Enter a guess number between 1 to 10");
            if(userInput.hasNextInt()){
               GuessNumByUser=userInput.nextInt();
               if(GuessNumByUser==expectedNum)
               {
                   System.out.println("Your number is right\nyou won the game");
                   break;
               }
               else if(GuessNumByUser<expectedNum){
                   System.out.println("Your number is smaller");
               }
               else if(GuessNumByUser>expectedNum){
                   System.out.println("Your number is greater");
               }
               if(attempt==3){
                   System.out.println("You have exceed maximum attempt.\nTry again");
                   break;
               }
               attempt++;
            }   
                else{
                       System.out.println("Guessed number is not valid integer");
                       break;
                        }
            
       } while(GuessNumByUser!=expectedNum);    
               
        
    }
    
}

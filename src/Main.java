import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Computer computer = new Computer();
        Player player = new Player();

        System.out.println("Welcome to \"Guess the Number\" game!");
        System.out.print("Please enter your name: ");
        player.setName(input.nextLine());

        System.out.println("You should choose the range of numbers and after we will start the game!\n(Number should be more or equal to 0 and maximal number should not be less than or equal to minimal number!)");

        String test = "Test for VCS";

        while(true){
            System.out.print("Enter minimal number: ");
            computer.setMinimalNumber(input.nextInt());
            if (computer.getMinimalNumber() < 0){
                System.out.println("Wrong input, Try again!");
            } else break;
        }

        while (true){
            System.out.print("Enter maximal number: ");
            computer.setMaximalNumber(input.nextInt());
            if(computer.getMaximalNumber() <= computer.getMinimalNumber()){
                System.out.println("Wrong input!");
            } else break;
        }

        computer.setImaginedNumber();

        System.out.println("Lets start the game! Try to guess number! You have 3 tries!");

        while(player.getNumberOfGuess() > 0){
            int playersChoice = input.nextInt();
            if (playersChoice == computer.getImaginedNumber()){
                System.out.println("Nice you won!");
                player.increaseScore();
            } else {
                player.reduceNumberOfGuess();
                if(player.getNumberOfGuess() > 0){
                    System.out.println("Wrong! Try again!");
                } else {
                    System.out.println("Wrong! You Lost!");
                }
            }
        }



    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Creating player and computer
        Computer computer = new Computer();
        Player player = new Player();

        //Before starting the game getting name of player
        System.out.println("Welcome to \"Guess the Number\" game!");
        System.out.print("Please enter your name: ");
        player.setName(input.nextLine());

        //Some instructions for user
        System.out.println("You should choose the range of numbers and after we will start the game!\n(Number should be more or equal to 0 and maximal number should not be less than or equal to minimal number!)");
        System.out.println("Game Lasts till 3 wins!");

        //Starting loop with started game
        while(player.getScore()<3 && computer.getScore() <3){
            //Setting number of guesses
            player.setNumberOfGuess(3);

            //setting initial value for minimal number
            while(true){
                System.out.print("Enter minimal number: ");
                computer.setMinimalNumber(input.nextInt());
                if (computer.getMinimalNumber() < 0){
                    System.out.println("Wrong input, Try again!");
                } else break;
            }

            //Setting initial value for maximal number
            while (true){
                System.out.print("Enter maximal number: ");
                computer.setMaximalNumber(input.nextInt());
                if(computer.getMaximalNumber() <= computer.getMinimalNumber()){
                    System.out.println("Wrong input!");
                } else break;
            }

            //Setting number what player will try to guess
            computer.setImaginedNumber();

            System.out.println("Lets start the game! Try to guess number! You have 3 tries!");

            //Player starts to guess
            while(player.getNumberOfGuess() > 0){
                int playersChoice = input.nextInt();
                if (playersChoice == computer.getImaginedNumber()){
                    System.out.println("Nice you won!");
                    player.increaseScore();
                    player.setNumberOfGuess(0);
                } else {
                    player.reduceNumberOfGuess();
                    if(player.getNumberOfGuess() > 0){
                        System.out.println("Wrong! Try again!");
                    } else {
                        System.out.println("Wrong! You Lost!");
                        computer.increaseScore();
                    }
                }
            }


            System.out.println("Current score:\nComputer - " + computer.getScore() + "\n" + player.getName() + "'s - " + player.getScore());

            //Getting results of the game, Finalizing.
            //Player WON / Computer WON
            if(player.getScore() == 3){
                System.out.println("Player Won! Thank you for the game!");
                System.out.println("Do you want to Play once again? Choose: \"1\" to start new Game, or any other key  to finish the session! ");
                int finalChoice = input.nextInt();
                if (finalChoice == 1){
                    computer.setScore(0);
                    player.setScore(0);
                }
            } else if(computer.getScore() == 3) {
                System.out.println("Computer Won! Thank you for the game!");
                System.out.println("Do you want to Play once again? Choose: \"1\" to start new Game, or any other key to finish the session! ");
                int finalChoice = input.nextInt();
                if (finalChoice == 1){
                    computer.setScore(0);
                    player.setScore(0);
                }
            }

        }
        }
    }

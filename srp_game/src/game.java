import java.util.Random;
import java.util.Scanner;

enum Move {
    ROCK, PAPER, SCISSORS

}

public class game {
    public static void main(String[] args) {
        System.out.println("HELLO IN GAME ");
        System.out.println("PICK PAPER/ROCK/SCISSORS (exit for exit)");
        int countPlayer = 0;
        int countComputer = 0;
        int tie = 0;
        while (true) {

            Scanner scanner = new Scanner(System.in);
            String inputMove = scanner.nextLine();
            if (inputMove.equals("exit")) {
                break;
            }
            String mov = String.valueOf(inputMove);
            String move = mov.toUpperCase();
            Move movee = Move.valueOf(move);
            System.out.println("Your move: " + mov);

            Random random = new Random();
            int moveComp = random.nextInt(3);
            //rock 0, paper 1, scissors 2
            if (moveComp == 0) {
                System.out.println("Computer move: Rock");
            } else if (moveComp == 1) {
                System.out.println("Computer move: Paper");
            } else {
                System.out.println("Computer move: Scissors");
            }

            switch (movee) {
                case ROCK:
                    if (moveComp == 0) {
                        System.out.println("Tie");
                        tie++;
                    } else if (moveComp == 1) {
                        System.out.println("Lose");
                        countComputer++;
                    } else {
                        System.out.println("Win");
                        countPlayer++;
                    }
                    break;
                case PAPER:
                    if (moveComp == 0) {
                        System.out.println("Win");
                        countPlayer++;
                    } else if (moveComp == 1) {
                        System.out.println("Tie");
                        tie++;
                    } else {
                        System.out.println("Lose");
                        countComputer++;
                    }
                    break;
                case SCISSORS:
                    if (moveComp == 0) {
                        System.out.println("Lose");
                        countComputer++;
                    } else if (moveComp == 1) {
                        System.out.println("Win");
                        countPlayer++;
                    } else {
                        System.out.println("Tie");
                        tie++;
                    }

            }
            System.out.println("Computer score: " + countComputer);
            System.out.println("Player score: " + countPlayer);
            System.out.println("Tie: " + tie);
        }


    }
}

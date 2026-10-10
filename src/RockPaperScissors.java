import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equals("Y")) {

            // Player 1's move
            String move1 = "";
            while (!move1.equals("R") && !move1.equals("P") && !move1.equals("S")) {
                System.out.print("Player 1, enter R, P, or S: ");
                move1 = input.nextLine().toUpperCase();
                if (!move1.equals("R") && !move1.equals("P") && !move1.equals("S")) {
                    System.out.println("Invalid move. Try again.");
                }
            }

            // Player 2's move
            String move2 = "";
            while (!move2.equals("R") && !move2.equals("P") && !move2.equals("S")) {
                System.out.print("Player 2, enter R, P, or, S: ");
                move2 = input.nextLine().toUpperCase();
                if (!move2.equals("R") && !move2.equals("P") && !move2.equals("S")) {
                    System.out.println("Invalid move. Try again.");
                }
            }

            // if-else statements
            System.out.println();
            if (move1.equals(move2)) {
                if (move1.equals("R")) {
                    System.out.println("You both picked rock. It's a tie.");
                } else if (move1.equals("P")) {
                    System.out.println("You both picked paper. It's a tie.");
                } else {
                    System.out.println("You both picked scissors. It's a tie.");
                }
            } else if (move1.equals("R") && move2.equals("S")) {
                System.out.println("Rock beats scissors. Player 1 wins.");
            } else if (move1.equals("R") && move2.equals("P")) {
                System.out.println("Paper covers rock. Player 2 wins.");
            } else if (move1.equals("P") && move2.equals("R")) {
                System.out.println("Paper covers rock. Player 1 wins.");
            } else if (move1.equals("P") && move2.equals("S")) {
                System.out.println("Scissors cut paper. Player 2 wins.");
            } else if (move1.equals("S") && move2.equals("P")) {
                System.out.println("Scissors cut paper. Player 1 wins.");
            } else if (move1.equals("S") && move2.equals("R")) {
                System.out.println("Rock beats scissors. Player 2 wins.");
            }

            // Play again
            playAgain = "";
            while (!playAgain.equals("Y") && !playAgain.equals("N")) {
                System.out.print("Play again? (Y/N): ");
                playAgain = input.nextLine().toUpperCase();
                if (!playAgain.equals("Y") && !playAgain.equals("N")) {
                    System.out.println("Invalid choice. Enter either Y or N.");
                }
            }
        }
    }
}

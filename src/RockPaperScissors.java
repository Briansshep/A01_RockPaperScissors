import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equals("Y")) {

            // Player A's move
            String PlayerA = "";
            while (!PlayerA.equals("R") && !PlayerA.equals("P") && !PlayerA.equals("S")) {
                System.out.print("Player A, enter R, P, or S: ");
                PlayerA = input.nextLine().toUpperCase();
                if (!PlayerA.equals("R") && !PlayerA.equals("P") && !PlayerA.equals("S")) {
                    System.out.println("Invalid move. Try again.");
                }
            }

            // Player B's move
            String PlayerB = "";
            while (!PlayerB.equals("R") && !PlayerB.equals("P") && !PlayerB.equals("S")) {
                System.out.print("Player B, enter R, P, or S: ");
                PlayerB = input.nextLine().toUpperCase();
                if (!PlayerB.equals("R") && !PlayerB.equals("P") && !PlayerB.equals("S")) {
                    System.out.println("Invalid move. Try again.");
                }
            }

            // if-else statements
            System.out.println();
            if (PlayerA.equals(PlayerB)) {
                if (PlayerA.equals("R")) {
                    System.out.println("You both picked rock. It's a tie.");
                } else if (PlayerA.equals("P")) {
                    System.out.println("You both picked paper. It's a tie.");
                } else {
                    System.out.println("You both picked scissors. It's a tie.");
                }
            } else if (PlayerA.equals("R") && PlayerB.equals("S")) {
                System.out.println("Rock beats scissors. Player A wins.");
            } else if (PlayerA.equals("R") && PlayerB.equals("P")) {
                System.out.println("Paper covers rock. Player B wins.");
            } else if (PlayerA.equals("P") && PlayerB.equals("R")) {
                System.out.println("Paper covers rock. Player A wins.");
            } else if (PlayerA.equals("P") && PlayerB.equals("S")) {
                System.out.println("Scissors cut paper. Player B wins.");
            } else if (PlayerA.equals("S") && PlayerB.equals("P")) {
                System.out.println("Scissors cut paper. Player A wins.");
            } else if (PlayerA.equals("S") && PlayerB.equals("R")) {
                System.out.println("Rock beats scissors. Player B wins.");
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

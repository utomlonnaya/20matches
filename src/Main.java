import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        NumberOfMatches matches = new NumberOfMatches();
        Move move = new Move();
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        int number = 0;
        System.out.println("Game is started");

        while (matches.getMathces() >= 1) {
            if (move.getMove() == true && matches.getMathces() == 1) {
                System.out.println("You lose");
                System.out.println("Game over");
                break;
            } else {
                if (move.getMove()) {
                    System.out.println("User's move: ");
                    number = sc.nextInt();
                    computer.setUserMathces(number);
                    player.makeAMove(number, matches);
                    if (number > 3 || number <= 0) {
                        move.setUserMove(true);
                        continue;
                    } else {
                        System.out.println("There are " + matches.getMathces() + " matches");
                        move.setUserMove(false);
                    }
                } else {
                    computer.computerMove(move, matches);
                    System.out.println("Computer's move");
                    System.out.println("There are " + matches.getMathces() + " matches");
                    move.setUserMove(true);
                }
            }
        }
    }
}
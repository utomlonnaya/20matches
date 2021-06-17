public class Computer {
    int usersMathces = 0;

    public void setUserMathces(int usersMathces) {
        this.usersMathces = usersMathces;
    }

    public void computerMove(Move move, NumberOfMatches matches) {
        if (move.getMove() == false) {
            if (usersMathces == 0) {
                matches.changeNumberOfMatches(3);
            } else {
                matches.changeNumberOfMatches(4 - usersMathces);
            }
        }
    }
}
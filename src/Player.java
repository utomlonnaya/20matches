public class Player {

    public void makeAMove(int userNumber, NumberOfMatches matches) {
        switch (userNumber) {
            case(1):
                matches.changeNumberOfMatches(1);
                break;
            case(2):
                matches.changeNumberOfMatches(2);
                break;
            case(3):
                if ((matches.getMathces() - userNumber) > 0) {
                    matches.changeNumberOfMatches(3);
                } else {
                    System.out.println("Enter the number from 1 to 3: ");
                }
                break;
            default:
                System.out.println("Enter the number from 1 to 3: ");
                break;
        }
    }
}
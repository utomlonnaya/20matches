public class NumberOfMatches {
    private int mathces = 20;

    public int getMathces() {
        return mathces;
    }

    public void changeNumberOfMatches(int userNumber) {
        switch (userNumber) {
            case(1):
                mathces -= 1;
                break;
            case(2):
                mathces -= 2;
                break;
            case(3):
                mathces -= 3;
                break;
            default:
                System.out.println("Enter the number from 1 to 3: ");
                break;
        }
    }
}
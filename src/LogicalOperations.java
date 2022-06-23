public class LogicalOperations {

    public int verifyTextAndNumber;

    public int getGreaterNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals("FastTrack") && number <= 3) {
            System.out.println(textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";
    }


    public String verifyText(String textInput) {
        if (textInput.equals("FastTrack")) {
            System.out.println("Learning text comparison");
        } else if (!textInput.equals("FastTrack")) {
            return "Got to try some more!";
        }
        return "Try more&more!";
    }


    public int getNr(int nr) {
        int nr;
        if (nr <= 8 && nr < 2) {
            return int nr;
        }
            return int nr;
    }
}
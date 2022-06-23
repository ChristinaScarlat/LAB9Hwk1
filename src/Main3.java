import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        // Give two numbers,
        // see which one is the greatest and print it
        int first = 3;
        int second = 2;

        LogicalOperations op = new LogicalOperations();
        System.out.println("Greater value is:" + op.getGreaterNumber(first,second));
// Given a text input and a number input,
// if the text is equal to “FastTrack” AND the
//number is equal to or lower than 3,
// print the text and the number. If the text is not
//“FastTrack” AND the number is equal to or higher than 4,
// print the number and the text, in this order.


   String textInput = "FastTrack";
   int number = 4;
        System.out.println(op.verifyTextAndNumber(textInput,number));

// 2. Given a text input, if it is “FastTrack”,
// then print “Learning text comparison”.
// If not, print “Got to try some more”

        System.out.println(op.verifyText(textInput));
// 3. Given a number, if it’s equal to or higher than 2 and
// equal to or lower than 8, print the number

        System.out.println(op.getNr());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter nr: ");
        int nr = scanner.nextInt();




    }
}

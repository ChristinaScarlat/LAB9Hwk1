import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
import static java.lang.System.*;

public class Read {

    public int getInt(){
        int number=0;
        boolean repeat = false;
        Scanner scan = new Scanner(in);
        do {
            try {

                out.println("Please enter a number:");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException exception) {
                err.println("Please enter a valid number! Given value: " + scan.next());
                repeat = true;
            }
        }while(repeat);


        return number;
    }


    public double getDouble() {
        double number = 0;
        boolean repeat;
        Scanner scan = new Scanner(in);
        do {
            try {
                out.println("Please enter a number: ");
                number = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException exception) {
                err.println("Please enter a valid number! Given value: " + scan.next());
                repeat = true;
            }
        } while (repeat);
        return number;
    }

    public float getFloat() {
        float number = 0;
        boolean repeat;
        Scanner scan = new Scanner(in);
        do {
            try {
                out.println("Please enter a number: ");
                number = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException exception) {
                err.println("Please enter a valid number! Given value: " + scan.next());
                repeat = true;
            }
        } while (repeat);
        return number;

    }

    public String getString() {
        String text = "";
        boolean repeat;
        Scanner scan = new Scanner(in);
        do {
            try {
                out.println("Please enter a text: ");
                text = scan.next();
                repeat = false;
            } catch (InputMismatchException exception) {
                err.println("Please enter a valid text! Given value: " + scan.next());
                repeat = true;
            }
        } while (repeat);
        return text;
    }

    public int[] getPopulatedArray(int nr){
        int[]array=new int[nr];
        out.println("Populate array with numbers: ");
        for (int i = 0; i <nr; i++) {
            int number=0;
            boolean repeat = false;
            Scanner scan = new Scanner(in);
            do {
                try {
                    out.println("Please enter a number:");
                    number = scan.nextInt();
                    array[i]=number;
                    repeat = false;
                } catch (InputMismatchException exception) {
                    err.println("Please enter a valid number! Given value: " + scan.next());
                    repeat = true;
                }
            }while(repeat);
            }
        return array;
    }

    public List<Integer> getPopulatedList(){
        List<Integer> listTry = new ArrayList<>();

        while(true) {
            try {
                Scanner scanner = new Scanner(in);

                out.print("Please enter a number: ");
                int number = scanner.nextInt();
                    for (int i = 0;i < listTry.size(); i++){
                     listTry.add(number);


                     out.println(listTry.set(i, number));
                }

            } catch (InputMismatchException exception) {
                err.println("An invalid value was entered.");
                break;
            }

        }
        return listTry;
    }






}

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


   String textInput = "FastTrackIT";
   int number = 4;
        System.out.println(op.verifyTextAndNumber(textInput,number));

// 2. Given a text input, if it is “FastTrack”,
// then print “Learning text comparison”.
// If not, print “Got to try some more”

        System.out.println(op.verifyText(textInput));
// 3. Given a number, if it’s equal to or higher than 2 and
// equal to or lower than 8, print the number


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter nr: ");
        int nr = scanner.nextInt();
        op.getNr(nr);

//6. Creati o metoda de tip String, care sa primeasca
// un parametru de tip int. Daca numarul primit este
// mai mare de 8, SAU egal cu 6, atunci sa se returneze
// “The amount of snow this winter was(cm): “ si numarul.
// Daca nu, sa printeze “The forecast snow is(cm):”
// si numarul. Apelati metoda in main() pentru a verifica
// daca functioneaza.

        System.out.println("Please enter nr1: ");
        int nr1 = scanner.nextInt();
        op.vfNrgetText(nr1);

//7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
// Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
// Daca numarul este egal cu 4, returnati “The number is equal to 4”,
// iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//
        System.out.println("Please enter number1: ");
        double number1 = scanner.nextDouble();
        op.vfdoublenr(number1);


//8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
// Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
// unde x trebuie sa reprezinte numarul apasat.
// Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
// "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul
// cu tot cu numar pentru fiecare caz din Switch-Case.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//
        System.out.println("Select one number:");
      int numar = scanner.nextInt();
      op.switchcase(numar);


//9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
// si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//
        System.out.println("Select X:");
        int X = scanner.nextInt();
        op.isNumberEven(X);
        System.out.println(op.isNumberEven(X));


//10. Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
// care sa reprezinte varsta, iar metoda sa iti zica daca daca persoana are drept de vot.
// Daca varsta e peste 18, sa se returneze true iar daca nu, sa returneze false.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//
        System.out.println("Select Age to vote:");
        int Age = scanner.nextInt();
        op.isEligibleToVote(Age);
        System.out.println(op.isEligibleToVote(Age));


//11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.

        System.out.println("Please enter n1: ");
        double n1 = scanner.nextDouble();
        System.out.println("Please enter n2: ");
        double n2 = scanner.nextDouble();
        System.out.println("Please enter n3: ");
        double n3 = scanner.nextDouble();
        op.vfbiggestnumber(n1, n2, n3);
    }
}

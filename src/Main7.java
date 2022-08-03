import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main7 {
    public static void main(String[] args) {
        Read read = new Read();

        List<Integer> myList11 = new ArrayList<>();
        for (int i=1; i<=100; i++) {
            myList11.add(i);
        }


       //Tema 7 Error Handling

//        1. In clasa Read, din programul vostru, creati o metoda tratat,
//        care sa returneze un numar de la tastatura.
        int x= read.getInt();
        System.out.println(x);

//        2. In clasa Read, duplicati metoda de la punctul 1, astfel incat
//        sa aveti mai multe metode, care sa citeasca si sa returneze si
//        alte tipuri de numere (float, int, double, long, etc)
//
        double y = read.getDouble();
        System.out.println(y);

        float z = read.getFloat();
        System.out.println(z);

        String text = read.getString();
        System.out.println(text);

//        3. In clasa Read, creati o metoda care sa returneze un array
//        de numere populat de la tastatura. Metoda sa primeasca ca si
//        parametru un numar, care reprezinta cate pozitii are.

          System.out.println("Enter array size: ");
          int S=new Scanner(System.in).nextInt();
          int array[]=read.getPopulatedArray(S);for (int j=0; j<S;j++){
          System.out.println(array[j]);}

//        4. In clasa Read, creati o metoda care sa returneze o lista
//        de numere populate de la tastatura. Metoda nu v-a primii
//        parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
//        (Hint: a se citi de la tastatura atata timp cat valoarea
//        primita e numar, cand nu mai e numar, sa se intrerupa citirea)

            System.out.println("Enter listTry: ");
            read.getPopulatedList();


//
//        5. In clasa LogicalOp, creati o metoda care sa primeasca
//        un array de numere ca si parametru, si un numar. Fara
//        a folosi conditii, si folosind un try-catch, afisati valoarea
//        de pe pozitia numarului primit, iar daca valoarea numarului
//        este mai mare decat numarul de pozitii din array, afisati
//        textul: "Inside catch, number too large".


        LogicalOperations op = new LogicalOperations();

        int[] array11={2,4,6,8,10,12,14,16,18,20};
        out.println("Set value: ");
        Scanner scan = new Scanner(in);
        int value = scan.nextInt();
       op.ValueArrayTry(array11, value);



//
//        6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda
//        sa nu returneze nimic, dar sa primeasca un parametru de tip
//        int. In interiorul ei, tratati metoda Thread.sleep(), astfel
//        incat metoda noastra sa primeasca valoarea in secunde, cat
//        sa astepte. Ex: wait(5) -> asteapta 5 secunde.
//
//                Mentiune: metoda Thread.sleep() se foloseste de milisecunde pentru a astepta.
//
        op.Wait();
        out.println("It's been 5 sec!");













    }
}

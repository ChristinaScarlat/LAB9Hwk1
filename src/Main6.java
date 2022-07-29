import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {

       List<Integer> myList = new ArrayList<>();
        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myListOfInt = new ArrayList<>();
       List<String> myListOfStrings = new ArrayList<>();
        int x=3;
        Integer y=3;

        myList.add(3);
        System.out.println(myList.get(0));
        myList.remove(y);
        System.out.println(myList.size());

       for (int i=1; i<=100; i++) {
           myListOfStrings.add(i + "");
           myListOfInt.add(i);
           myList.add(i);
           myList1.add(i);
        }

       for (String value: myListOfStrings){
           System.out.println(value);}
      System.out.println(myListOfStrings);

        LogicalOperations op = new LogicalOperations();

        List<Integer> z = new ArrayList<>();
        op.addToEndOfList(myList,555);

        List<Integer> unorderedList = new ArrayList<>();
        unorderedList.add(13);
        unorderedList.add(11);
        unorderedList.add(123);
        unorderedList.add(12);
        unorderedList.add(111);
        unorderedList.add(122);



        Calcule calc = new Calcule();
        calc.sum6(myList);



//1. Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa
// afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.


       op.printList1(myList1);


//2.Scrieti o metoda Java, care sa primeasca doi parametrii:
// un parametru sa fie o lista de numere, si celalalt un numar
// (real sau intreg). Metoda sa adauge numarul primit ca si parametru
// la final de lista.


        op.addNumberToList(myList,5555);


//3.Scrieti o metoda Java, care sa primeasca doi parametrii:
// un parametru de tip Lista, iar celalalt un numar intreg.
// Sa se parcurga lista si sa afiseze, pe rand, toate valorile
// din lista, fiecare pe rand nou, pornind de la numarul intreg
// primit ca si parametru.

        op.printListByIndex(myList,95);


//4.Scrieti o metoda Java, care sa primeasca parametru o Lista,
// si sa afiseze, pe rand, toate valorile din lista, dar invers
// (de la capat la inceput).
        op.printNumbersBackwardsFromList(myList);

//5.Scrieti o metoda Java, care sa primeasca trei parametrii:
// unul de tip Lista de String-uri, unul de tip intreg, si unul
// de tip String. Metoda sa adauge parametrul de tip String in
// lista primita, iar parametrul de tip intreg reprezinta pozitia
// la care sa fie pus acel String.
        op.addStringParameterAndPoz(myListOfStrings, 2,"new item");


//6.Scrieti o metoda Java, care sa primeasca doi parametrii.
// Primul dintre ei va fi o Lista, iar metoda sa ia al doilea
// parametru si sa il adauge pe prima pozitie din lista.

        op.addNumbertoFirstPosition(myList1,777);


//7.Scrieti o metoda Java care sa primeasca parametru o Lista,
// si sa afiseze ce valori are lista, si ce pe ce pozitie.
// (Ex: “Pe pozitia 1 valoare este 4”).

        op.printListPositionsAndValues(myList1);


//8.Scrieti o metoda Java care sa primeasca o Lista si sa returneze
// cel mai mare numar din ea.

        System.out.println(op.getHighestNumber(myList1));

//Tema optionala - Lists
//Rezolvati urmatoarele exercitii:
//
//1.Scrieti o metoda Java care sa schimbe pozitia a doua elemente
// intr-o Lista,
        op.switchTowNumbersToList(unorderedList);


//2.Scrieti o metoda Java care sa primeasca o Lista si sa returneze
// o alta lista, care sa contina doar numerele pare din lista primita.

        op.printListEvenValues(myList1);

//3.Scrieti o metoda Java care sa primeasca parametru o Lista nesortata,
// si sa returneze Lista sortata crescator. Atentie, sortarea sa se
// faca programatic(adica logica sa fie scrisa de voi),
// si nu folosit librarie externa, precum Collection.sort().
        op.printUnorderedListOrdered(unorderedList);



    }
}

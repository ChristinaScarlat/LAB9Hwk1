public class Main5 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();


        int[] secondArray = {1,2,45,123123,111,333};
        System.out.println(op.getAverageFromArray(secondArray));

//5. Creati o metoda care sa primeasca un parametru de tip array de
// string-uri, populat cu valori, si un parametru de tip String.
// Metoda sa verifice daca valoarea string-ului primit se regaseste
// in array-ul primit, iar daca da sa returneze true iar daca nu,
// sa returneze false.  Apelati metoda in main() pentru a verifica
// daca functioneaza.

        String[] myArrayOfStrings = {"x","y","z"};
        System.out.println();
        if (op.isValueinArray(myArrayOfStrings, "z"))
            System.out.println("Valoarea e in array");
        else {
            System.out.println("Valoarea nu este in array");
        }
        String[] newArray={"you","you"};
        op.isValueinArray(newArray,"you");

       Calcule calc = new Calcule();


//1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului polimorfismului.
// Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
//Spre exemplu, pentru metoda de adunare, faceti ca aceasta sa lucreze o data cu 2 int-uri,
// o data cu 2 float-uri, cu 3 float-uri, cu 4 int-uri, etc. Atentie ce returnati la final!




//2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii,
// valorile de la 1 la 100. Sa se afiseze progresul in consola pe tot parcursul.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//
     //  int[] myArray = op.populateArrayUpToNumber(100);
      //  op.printArray(myArray);



//3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il
// returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza.
// Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.
//
        int[] myArray2 = op.populateArrayUpToEvenNumber(100);
         op.printEvenArray(myArray2);



//4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
// Metoda sa calculeze si sa returneze media numerelor din array.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//
        int[] array3 = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31};
        System.out.print(op.getAverageArray(array3));



//6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
// si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit,
// si daca da, atunci sa returneze pozitia pe care se afla numarul.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//
        int[] array4={2,4,6,8,10,12,14,16,18,20};
        int value = 10;
        op.ValueinArray(array4,value);


//7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//- - - - - - - - - -
//


//8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
// si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da,
// sa returneze array-ul primit, fara acel numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//



//9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
// Apelati metoda in main() pentru a verifica daca functioneaza.
//



//10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
// Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
// Apelati metoda in main() pentru a verifica daca functioneaza.



//      1. Creati o metoda care insereze un element pe o pozitie specifica intr-un array.




//      2. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.



//      3. Creati o metoda care sa inverseze valorile unui array de int-uri.




//      4. Creati o metoda care sa gaseasca toate valorile duplicate dintr-un array.




 //     5. Creati o metoda care sa gaseasca toate elementele comune intre doua array-uri (array de String).




 //     6. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.






    }
}

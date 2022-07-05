public class Main5 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();
        int[] myArray = op.populateArrayUpToNumber(100);
        op.printArray(myArray);

        int[] secondArray = {1,2,45,123123,111,333};
     //   System.out.println(op.getAverageFromArray(secondArray));

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



    }
}

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        System.out.println("1. Pentru exercitiile din clasa main() de data trecuta, creati metode separate pentru fiecare");

        System.out.println(Text.cerinta);
        System.out.println(Text.write);
        Text.printMyName();

        Text cerinta = new Text();
        Text write = new Text();
        Text printMyName = new Text();

        Calcule calc = new Calcule();


        System.out.println(calc.sum(5, 6));
        System.out.println(calc.division(100.33, 9));
        System.out.println(calc.operations(5, 8, 6));
        System.out.println(calc.operations(55, 9));
        System.out.println(calc.operations(20, 3, 5, 8));
        System.out.println(calc.operations(15, 3, 5, 8, 2));

        System.out.println("2. Scrieti care o metoda java pentru fiecare din urmatoarele operatii matematice: adunare, scadere, inmultire, impartire.");

        Calcule adunare = new Calcule();
        System.out.println("Rezultatul adunarii este: " + adunare.adunare(2, 5));

        Calcule scadere = new Calcule();
        System.out.println("Rezultatul scaderii este: " + scadere.scadere(15, 799));

        Calcule inmultire = new Calcule();
        System.out.println("Rezultatul inmultirii este: " + inmultire.inmultire(225, 75));

        Calcule impartire = new Calcule();
        System.out.println("Rezultatul impartirii este: " + impartire.impartire(2468, 1357));

        Print print = new Print();
        System.out.println("3. Scrieti o metoda java, care sa afiseze urmatorul model:\n");
        print.JavaWrite();


        System.out.println("4.Scrieti o metoda java, care sa primeasca 3 parametrii de tip numar, si sa returneze media numerelor");
        Calcule Media = new Calcule();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter n1: ");
        int n1 = scanner.nextInt();
        System.out.println("Please enter n2: ");
        int n2 = scanner.nextInt();
        System.out.println("Please enter n3: ");
        int n3 = scanner.nextInt();
        System.out.println("Media celor 3 numere este:M=(n1+n2+n3)/3=" + Media.Media(n1, n2, n3));

        Print printR = new Print();
        System.out.println("5.Scrieti o metoda java, care sa afiseze urmatorul model:\n");
        print.Robo();


        System.out.println("6.Scrieti o metoda java, care sa returneze restul impartirii a doua numere");
        Calcule modulo = new Calcule();

        System.out.println("Please enter Nr1: ");
        double Nr1 = scanner.nextDouble();
        System.out.println("Please enter Nr2: ");
        double Nr2 = scanner.nextDouble();

        System.out.println("Rezultatul impartirii este: Restul=" + modulo.modulo(Nr1, Nr2));


        System.out.println("7.Scrieti o metoda java, care sa primeasca ca si parametru un numar, care sa reprezinte temperatura in Fahrenheit,\n" +
                "si sa returneze temperatura in Celsius. Formula de calcul este: C = 5/9 * (Fh -32)");
        Calcule Grade = new Calcule();
        System.out.println("Please enter Grade Fahrenheit: Fh=");
        float Fh = scanner.nextFloat();
        System.out.println("Conversie Grade Fahrenheit in Grade Celsius: C=" + Grade.Grade(Fh));


        System.out.println("8.Scrieti o metoda java, care sa primeasca ca si parametru un numar real,\n" +
                " care sa reprezinte distanta in inch, si sa returneze distanta in metrii");

        System.out.println("Please enter a number of inches:");
        double inch = scanner.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(meters + "m");


        System.out.println("9.Scrieti o metoda java, care primeste distanta (in metri) si timpul (ca si 3 numere: ore, minute, secunde),\n" +
                " si afiseaza viteza, in metrii pe secunda, kilometrii pe ora si mile pe ora. (Indiciu: 1 mila = 1609 metrii)");

        Calcule Time = new Calcule();
        System.out.println("Please enter distance in meters:");
        double distance = scanner.nextDouble();
        System.out.println("Please enter time t1 in seconds:" + "secunde");
        double t1 = scanner.nextDouble();
        System.out.println("Please enter time t2 in minutes:");
        double t2 = scanner.nextDouble();
        System.out.println("Please enter time t3 in hours:");
        double t3 = scanner.nextDouble();

        double speed1 =distance/t1;
        double speed2 = distance/1000.0D/t2*60.0D;
        double speed3 = distance/1609.0D/t3;
        System.out.println(speed1 + " m/s\n"+
                speed2 + " km/h\n"+
                speed3 + " mile/h");


    }


}

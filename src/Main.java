public class Main {
    public static <print> void main(String[] args) {
        System.out.println("1. Printati \"Hello\" in consola, iar pe rand nou, printati numele vostru.");
        System.out.println("Hello!");
        System.out.println("Christina Scarlat");

        System.out.println("2. Printati rezultatul sumei a doua numere(orice numere)");

        int a=2;
        int b=5;
        double c=a+b;
        System.out.println(c);

        System.out.println("3. Printati rezultatul impartirii a doua numere. Atentie, daca numarul nu este intreg, sa afiseze si valorile dupa virgula.");

        double x=100.33;
        int z=9;
        double w=x/z;
        System.out.println(w);

        System.out.println("4. Printati rezultatul urmatoarelor operatiuni:\n" +

                "a. -5 + 8 * 6\n" +
                "\n" +
                "b. (55+9) % 9 \n" +
                "\n" +
                "c. 20 + -3*5 / 8 \n" +
                "\n" +
                "d. 5 + 15 / 3 * 2 - 8 % 3 ");


        double e=-5;
        int f=8;
        int g=6;
        double h=e+f*g;
        System.out.println(h);

        int x1=55;
        int y1=9;
        double z1=(x1+y1)%y1;
        System.out.println(z1);

        int i=20;
        int j=-3;
        int k=5;
        int l=i+j*k/f;
        System.out.println(l);

        int u= 15;
        int v=3;
        int n=2;
        int s=k+u/v*n-f%v;
        System.out.println(s);

    }
}

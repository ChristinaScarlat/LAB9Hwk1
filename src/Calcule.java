public class Calcule {

    public int sum(int first, int second){
         System.out.println("2. Printati rezultatul sumei a doua numere(orice numere)\n"+
                 "a+b=5+6");
        return first+second;
    }
    public double division(double x, int y){
        System.out.println("3. Printati rezultatul impartirii a doua numere.\n" +
                "x/y=100.33 / 9");
         return x/y;
    }
    public float operations(float a, int b, int c) {
        System.out.println("4. Printati rezultatul urmatoarelor operatiuni:\n" +
                "a. -5 + 8 * 6" );
        return -a + b * c;
    }
        public double operations(int d, float e){
            System.out.println( "b. (55+9) % 9");
        return (d+e)%e;
    }
    public float operations(float f, int g, int a, double h) {
        System.out.println("c. 20 + -3*5 / 8" );
        return (float) (f + -g * a / h);
    }

    public float operations(float i, int g, int a, double h, int j) {
        System.out.println("d. 5 + 15 / 3 * 2 - 8 % 3 ");
        return (float) (a+i/g*j-h%g);
     }

     public int adunare(int primul_numar, int aldoilea_numar){
         int R = primul_numar+aldoilea_numar;
         return R;
     }
     public int scadere(int primul_numar, int aldoilea_numar){
         int Rez = primul_numar-aldoilea_numar;
         return Rez;
     }
    public double inmultire(int primul_numar, int aldoilea_numar) {
        double Rr = primul_numar * aldoilea_numar;
        return Rr;
    }
    public float impartire(float primul_numar, float aldoilea_numar) {
        float Rezultat = primul_numar / aldoilea_numar;
        return Rezultat;
    }
    public int Media(int n1, int n2, int n3) {
        int M = (n1 + n2 + n3) / 3;
        return M;
    }

    public double modulo(double Nr1, double Nr2) {
        double Restul = Nr1 % Nr2;
        return Restul;
    }

    public float Grade(float Fh){
        float C= (5.0f/9.0f*(Fh-32));
        return C;
        }



    }





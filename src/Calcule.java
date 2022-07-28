import java.util.List;

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
    public void printOneToHundred(int x1){
        int i=x1;
        System.out.println("Print numbers 1to100:");
        while (i<=100){
            System.out.println(i);
            i++;
        }

    }
    public void printOneToHundredminus(int y1){
        int i=y1;
        System.out.println("Print numbers 1to100:");
        while (i>=-100){
            System.out.println(i);
            i--;
        }
    }
    public void printaTob(int a1, int b1){
        int i=a1;
        System.out.println("a=" + a1 +"\nb="+b1);
         while (i<=b1){
            System.out.println(i);
             i++;
        }}
    public void printYToX(double X1, double Y1){
       double i =X1;
        System.out.println("X="+ X1+"\nY="+ Y1);
         while (i>Y1){
            System.out.println(i);
                i--;
            }}
    public void printEvenNumber(int r1){
        int i=r1;
        System.out.println("Print Even numbers 1to100:");
        while(i<100){
            if (i%2==0){
                System.out.println(i);}
            i++;
        }}
    public void printOddNumber(int s1){
        int i=s1;
        System.out.println("Print Odd numbers 1to100:");
        while(i<100){
            if (i%2!=0){
                System.out.println(i);}
            i++;
        }}
    public double getAverageInInterval(int start, int finish){
        int sum = 0;
        double count = 0;

        while(start<=finish){
            sum = sum +start;
            sum++;
            count++;}
        return sum/count;
    }
    public double getAverageForNumberDiv7(int n1, int nn){

        int sum =0;
        double count = 0;
           while (n1 <=nn) {
                  if (n1%7==0) {
                      sum=sum+n1;
                      count++;
                    }}
        return sum / count;
        }

    public void getFibonaci() {
       int n =20;
        int n0 = 0;
        int n1 = 1;
        int i=1;
        while (i<=n) {
            System.out.println(n0 + "");
            int n2 = n0 + n1;
            n0 = n1;
            n1 = n2;
            i++;
        }
    }
    public void CozaLozaWoza() {
        for (int x = 1; x <= 110; x +=1) {
            if (x % 3 == 0) {
                System.out.print("Coza");
            }else if (x % 5 == 0) {
                System.out.print("Loza");
            }else if (x % 7 == 0) {
                System.out.print("Woza");
            }else if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0) {
                System.out.print(" " + x);
            }
            if (x % 11 == 0) {
}}}
    public int sum6(int parameterVariable, int b) {
        return parameterVariable + b;
    }
    public int sum6(int parameterVariable, int b, int c) {
        return parameterVariable + b + c;
    }

    public double sum6(List<Integer> list){

        return 0;
    }

    public double substract(double x, double y) {
        return x - y;
    }





}








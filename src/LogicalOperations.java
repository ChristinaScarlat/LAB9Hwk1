public class LogicalOperations {


    public int getGreaterNumber(int first, int second) {
        if (first < second) {
            return second;
        } else {
            return first;
        }
    }

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals("FastTrackIT") && number <= 3) {
            System.out.println(textInput + number);
        } else if (!textInput.equals("FastTrackIT") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";
    }


    public String verifyText(String textInput) {
        if (textInput.equals("FastTrack")) {
            System.out.println("Learning text comparison");
        } else if (!textInput.equals("FastTrack")) {
            return "Got to try some more!";
        }
        return "Try more&more!";
    }


    public void getNr(int nr) {
        if (nr >= 2 && nr <=8)
            System.out.println(nr);
        }

    public String vfNrgetText(int nr1){
        if (nr1 > 8 || nr1 == 6){
            System.out.println("The amount of snow this winter🎄 was:" + nr1 + "(cm)");
        }else if (nr1<8 && nr1 != 6 && nr1 !=8){//am schimbat putin conditiile sa imi returneze ultima linie dar tot gol lasa! gresesc undeva?
        System.out.println("The forecast snow is:" + nr1 + "(cm)");
    }return "It will be sunny🌞!";}


    public String vfdoublenr(double number1){
        if (number1 >3 && number1 !=4){
            System.out.println("The number1 is greater than 3 and not equal to 4.");
        }else if (number1 == 4){
            System.out.println("The number1 is equal to 4.");
        } else if (number1 < 3) {
            System.out.println("The number1 is lower than 3.");

        }return "Not applicable";} //este interesant ca tot nu returneaza ultima linie cand nu sunt indeplinite conditiile



       public void switchcase (int numar){

               switch (numar){
        case 100:
            System.out.println("The number is:  100!"); break;
        case 500:
            System.out.println("The number is:  500!"); break;
        case 1000:
            System.out.println("The number is:  1000!"); break;
        default:System.out.println("Not in 100, 500, 1000");
    }
    }
    public boolean isNumberEven(int X){
        if ((X%2)==0){
            return true;
                   }else {
            return false;
         }
        }

    public boolean isEligibleToVote(int Age){
        if (Age>=18){
            return true;
        }else {
            return false;
        }
    }
    public String vfbiggestnumber(double n1, double n2, double n3){
        if (n1 >n2 && n1>=n3){
            System.out.println("The number n1 is the biggest:" + n1);
        }else if (n2 >n1 && n2>=n3){
            System.out.println("The number n2 is the biggest:" + n2);
        } else if (n3 >n2 && n3>=n1) {
            System.out.println("The number n3 is the biggest:" + n3);

        }return "Not applicable";}

    public void printToHundred(int x){
      for (int i=x;i<=100;i++){
       System.out.println(i);
    }}
    public double sumAndAverage(){
            int sum=0;
            for (int i=1;i<=100;i++){
                sum+=i;
            }
        System.out.println(sum);
            return sum / 100d;
    }

    public double getAverageInInterval(int start, int finish){
    int sum = 0;
    double count = 0;
      while(start<=finish){
        sum = sum +start;
          sum++;
          count++;}
            return sum/count;
    }

   public double getAverageForEvenInInterval(int start, int finish){
            int sum = 0;
            double count = 0;
            while (start <= finish) {
                if ((start % 2) == 0) {
                    sum = sum + start;
                    count++;
                }
                start++;
            }
            return sum / count;}

    public double getAverageForOddInInterval(int start, int finish){
        int sum = 0;
        double count = 0;
        while (start <= finish) {
            if ((start % 2) != 0) {
                sum = sum + start;
                count++;
            }
            start++;
        }
        return sum / count;}

    public void printToHundredminus(int z){
        for (int i=z;i>-100;i--){
            System.out.println(i);
        }}
    public void printaTob(int a, int b){
        for (int i=a;i<=b;i++){
            System.out.println(i);
        }}
    public void printYToX(double X, double Y){
        if (X>Y){
        for (double i=X;i>Y;i--){
            System.out.println(i);
        }}}

    public void printEvenNumber(int r){
        for (int i=r;i<100; i++){
            if (i%2==0){
         System.out.println(i);}
            }}
    public void printOddNumber(int s){
        for (int i=s;i<100; i++){
            if (i%2!=0){
                System.out.println(i);}
        }}
    public double sum(){
        int sum=0;
        for (int i=1;i<=100;i++){
            sum+=i;
        }
        return sum++;
    }
   // public void printStars(){
     //   String star = "*";
     //   for(int j; j<=7; j++){
     //   for(int i=7-j; i>=1; i--){
     //       System.out.print(star);
     //   }
      //      System.out.println();
   // }}

public int[] populateArrayUpToNumber(int number){
        int[]array=new int[number];

        for(int i=0; i<array.length; i++){
            array[i]=i+1;
        }
        return array;
}
public void printArray(int[] array){
        for (int i=0;i< array.length; i++){
            System.out.println(array[i]+ " ");
        }
}
public double getAverageFromArray(int[]array){
       double sum=0;
       for (int i=0; i < array.length; i++) {
           sum += array[i];
       }
    return sum / array.length;
        }
 public boolean isValueinArray(String[]array, String value) {
     for (int i = 0; i < array.length; i++) {
         if (array[i].equals(value)) {
             return true;
         }
     }
     return false;
 }













}




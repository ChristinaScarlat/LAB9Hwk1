import java.util.List;

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
   public void printStars(){
        String star = "*";
       for(int i2 = 0; i2<=7; i2++){
           for(int i=7-i2; i2>=1; i--){
                 System.out.print(star);
                 }
                 System.out.println();
               }}

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


   public int[] populateArrayUpToEvenNumber(int[]array2){
       int j=0;

       for (int i=1;i<100; i++){
             if (i % 2 == 0){
                 array2[j] = i;
                 j++;
                }}
        return array2;
    }

    public double getAverageArray(int[]array3){
        double sum=0;
        for (int i=0; i < array3.length; i++) {
            sum += array3[i];
        }
        return (sum / array3.length);
    }

    public double ValueinArray(int[]array4,int value) {
        for (int i = 0; i < array4.length; i++) {
            if (array4[i]==(value)) {
                return i;
            }
        } return value;
    }

    public void drawLines() {
        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};

        for (int i = 0; i <= 10; i++) {
            System.out.println(line);
        }
    }

    public int[] removeNrFromArray(int[] myArray, int nr) {
        int[] secondArray = new int[myArray.length];
        int j = 0;

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == nr)
                continue;
            secondArray[j++] = myArray[i];
        }
        int[] finArray = new int[j];
        for (int i = 0; i < j; i++)
            finArray[i] = secondArray[i];
        return finArray;
    }

    public int getSecondSmallestNrInArray(int[] myArray) {
        int temporary = 0;
        for(int i = 0; i< myArray.length;i++){
            for(int j = i + 1;j<myArray.length;j++){
                if(myArray[i] > myArray[j]){
                    temporary = myArray[j];
                    myArray[j] = myArray[i];
                    myArray[i] = temporary;
                }
            }
        }
        return myArray[1];
    }

    public int[] copyArray(int[] firstArray, int[] emptyArray) {
        for (int i = 0, j = 0; i < firstArray.length; i++) {
            emptyArray[j] = firstArray[i];
            j++;
        }
       return emptyArray;
    }

public void printNumbersBackwardsFromList(List<Integer>myList){
        for (int i = myList.size()-1; i>=0; i--){
            System.out.println(myList.get(i));
        }}

  public void addToEndOfList(List<Integer>list, int a){
      list.add(a);
   }


    public int getHighestNumber (List<Integer> list){
        int max = list.get(0);
        for (int x:list){
            if (x>max){
                max = x;
            }
        }
        return max;

    }

//Tema Lab6

    public void printList1(List<Integer>myList1){
        for (int i = 0; i<myList1.size(); i++){
            System.out.println(myList1.get(i));
        }
    }
    public void addNumberToList(List<Integer>myList, int number){
            myList.add(number);
    }

    public void printListByIndex(List<Integer> myList, int position){
        for (int i = position;i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
    public void addStringParameterAndPoz(List<String>myListOfStrings, int poz, String text){
        myListOfStrings.add(poz,text);
        System.out.println(myListOfStrings);
        }

        public void addNumbertoFirstPosition(List<Integer>myList1, int nr){
        myList1.add(0,nr);
            System.out.println(myList1);
        }

        public void printListPositionsAndValues(List<Integer>myList1){
            for (int i = 0; i<myList1.size(); i++){
            System.out.println("Position"+i+"Value"+myList1.get(i));}
        }

    public void printListEvenValues(List<Integer>myList1){
        for (int i = 0; i<myList1.size(); i++){
            if (i%2==0){
                System.out.println(myList1.get(i));
            }


        }
    }

    /*
    *      List<Integer> unorderedList = new ArrayList<>();
        unorderedList.add(13);
        unorderedList.add(11);
        unorderedList.add(123);
        unorderedList.add(12);
        unorderedList.add(111);
        unorderedList.add(122);
        * */

    public void printUnorderedListOrdered(List<Integer> unorderedList) {
        for (int i = 0; i < unorderedList.size(); i++) {
            for (int j = i + 1; j < unorderedList.size(); j++) {
                if (unorderedList.get(i) > unorderedList.get(j)) {
                    int x = unorderedList.get(i);
                    unorderedList.set(i, unorderedList.get(j));
                    unorderedList.set(j, x);
                }
            }
        }
        for (Integer list:unorderedList){

        System.out.println(list);
     }
}



}
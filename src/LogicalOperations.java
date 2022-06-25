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


    }





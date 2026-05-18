public class calculatortest {
    public static void main(String[] args) {
        calculator cal = new calculator();
        if(cal.add(2,3) == 5){
            System.out.println("Adding Test Passed.");
        }else{
            System.out.println("Adding Test Failed.");
        }

        if(cal.substract(3,2) == 1){
            System.out.println("Substracting Test Passed.");
        }else{
            System.out.println("Substracting Test Failed.");
        }
    }   
}


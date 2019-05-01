
import java.util.Scanner;


public class TipCalculatorTest {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        double billAmt;
        double percent;
        double numOfPeople;
        
        //welcome message
        
        System.out.println("Hello!");
        System.out.println("Welcome to Storm's Tip Calculator.");
        System.out.println("Please enter amounts when prompted:");
        
        //white space
        System.out.println();
        
        //prompt
        System.out.println("Please enter the Bill Amount: ");
        billAmt = input.nextDouble();
        
        System.out.println("Please enter percent (use this format -> .xx: ");
        percent = input.nextDouble();
        
        System.out.println("Please enter the number of people sharing the tip: ");
        numOfPeople = input.nextDouble();
        
        TipCalculator tipCalc = new TipCalculator(billAmt, percent, numOfPeople);
        tipCalc.calculateTip();
    }
}

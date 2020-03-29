import java.util.Scanner;
public class ExchangeApp {
    private static double getConversion;

	public static void main(String[] args) {
        //TODO:declare local variables
    	double amount;
    	double rate;
    	
//TODO:declare objects
Scanner Info = new Scanner (System.in);

        //TODO:input
        System.out.println("\tPlease enter amount to be converted: ");
        
        //TODO:setMethod to put sc value
        amount = Info.nextDouble();
        
        //TODO:setMethod to put sc value
        System.out.println("\nPlease enter \nthe conversion rate: ");
       //TODO:setMethod to put sc value
        rate = Info.nextDouble();
        
Exchange ExchangeApp;
ExchangeApp = new Exchange();
        //TODO:setMethod
        //TODO:process
Exchange.getConversion(getConversion);

        //TODO:output
       System.out.println(+ amount + " at a rate of " + rate + " is " + getConversion);
    }//end main
}//end class
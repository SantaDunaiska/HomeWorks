import java.util.Scanner;
public class ExchangeApp {
	static int n;
	
	static double i = 0.90;
	static double j = 1.12;
	static Scanner userInfo = new Scanner(System.in);
	public static void main(String[] args) {
		//declare local variables
	Exchange ExchangeApp;
	ExchangeApp = new Exchange();
		//declare objects

	
		//input
		System.out.println("Please enter the amount you would like to exchange: " );
		n = userInfo.nextInt();
		ExchangeApp.getConvertionEUR();
		ExchangeApp.getConvertionUSD();
 
		
		//double ConvertionUSD = j * n;
		//double ConvertionEUR = n * i;
		
		System.out.println("Your amount in EUR would be  EUR " + ExchangeApp.getConvertionEUR()*n);
		System.out.println("Your amount in USD would be  USD " + ExchangeApp.getConvertionUSD()*n);

	}

}

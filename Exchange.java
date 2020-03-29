
public class Exchange {

	//declare data members amount, rate, conversion
	
	String EUR;
	String USD;
	private int EURamount;
	private int USDamount;
	private double ConvertionEUR;
	private double ConvertionUSD;
	
	private double i = 1.12;
	private double j = 0.90;
	private double aEUR = 1.0;
	private double aUSD = 1.0;
	
public void RateCalculations(double ConvertionEUR, double ConvertionUSD){	
	
	//set methods	
ConvertionEUR = aEUR *= i;
ConvertionUSD = aUSD *= j;}
	
	//constructor
	public Exchange() {
	}
	//constructor - amount, rate 
	public void setAmount(int EURamount, int USDamount)  {
	this.EURamount = EURamount;
	this.USDamount = USDamount;}
	


	public double getConvertionEUR() {
		return ConvertionEUR;
	}

	public void setConvertionEUR(double convertionEUR) {
		ConvertionEUR = convertionEUR;
	}

	public double getConvertionUSD() {
		return ConvertionUSD;
	}

	public void setConvertionUSD(double convertionUSD) {
		ConvertionUSD = convertionUSD;
	}


	}
	
	




public class Exchange {
    //TODO: declare data members- amount, rate, conversion
	private static double amount;
	private static int rate;
	private static double conversion;

    //TODO:constructor
public Exchange () {}
	//TODO:constructor - amount, rate
public void setInt(int amount, int rate){
Exchange.amount = amount;
Exchange.rate = rate;}

	//TODO:set methods
	//TODO:calculation = conversion
static void calculationMethod() {
	setConversion(amount * rate);
}
public static double getConversion(double d) {
	return conversion;
}
public static void setConversion(double conversion) {
	Exchange.conversion = conversion;
}
    
   
    //TODO:get method return conversion
}


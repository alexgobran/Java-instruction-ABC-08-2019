import java.text.NumberFormat;

public class Mathmethods {

	public static void main(String[] args) {
		
		int r =(int)Math.random()*10 + 1;
		System.out.println(r);

		//rounding
		double d = 4.567;
		d*= 100;
		double dr = Math.round(d);
		dr/= 100;
		System.out.println(dr);
		System.out.println("Bye");
		
		//max /min
		double m = Math.min(5.7, 3.2);
		System.out.println(m);
		
		double price = 44343.90;
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		
		System.out.println(currency.format(price));
		
		NumberFormat percent = NumberFormat.getCurrencyInstance();
		percent.setMinimumFractionDigits(2);
		double interest = .0745;
		System.out.println(percent.format(interest));
	}

}

//Shelby Brown
import java.util.*;

public class CashRegister {

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System. in);
		//Variables set to double to store numbers with decimals.
		double n1, n2 , n3, p1, p2, p3, answ1, answ2, answ3, sub, tax, total; 
		
		System.out.print("Enter the quantity of the first product: ");
		n1 = kbd.nextDouble(); //The amount of the first product.
		
		System.out.print("Enter the price of the first product: $");
		p1 = kbd.nextDouble(); //Price of the first product.
		answ1 = n1 * p1; //Multiples the number of products and the price.
		
		System.out.print("Enter the quantity of the second product: ");
		n2 = kbd.nextDouble();
		
		System.out.print("Enter the price of the second product: $");
		p2 = kbd.nextDouble();
		answ2 = n2 * p2;
		
		System.out.print("Enter the quantity of the third product: ");
		n3 = kbd.nextDouble();
		
		System.out.print("Enter the price of the third product: $");
		p3 = kbd.nextDouble();
		answ3 = n3 * p3;
		System.out.println(""); //Space so that it does not enter.
		
		sub = answ1 + answ2 + answ3; //Calculates the sum of all the prices.
		System.out.printf("Subtotal: $.2f \n", sub);
		
		tax = sub * 0.07; //Determines the tax from the subtotal.
		System.out.printf("Sales Tax: $%.2f \n", tax);
		
		total = sub + tax; //Adds the tax to the subtotal to get the total.
		System.out.printf("Total Due: $%.2f \n",total);
		
		kbd.close();
	}

}

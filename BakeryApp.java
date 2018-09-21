package edu.ilstu;
/**
 * 
 */
import java.util.Scanner;



/**
 * @author Anthony
 *
 */
public class BakeryApp {

	
	public static void main(String[] args) 
	{
	
		System.out.println("\tBakery Shop Menu");
		System.out.println("Cookie\t\t\t $0.70");
		System.out.println("Donut\t\t\t $1.25");
		System.out.println("Cake\t\t\t $6.50");
		System.out.println("Pie\t\t\t $8.50");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nPlease enter the number of Cookies: ");
		int numberOfCookies = input.nextInt();
		
		System.out.println("Please enter the number of Donuts: ");
		int numberOfDonuts = input.nextInt();
		
		System.out.println("Please enter the number of Cakes: ");
		int numberOfCakes = input.nextInt();
		
		System.out.println("Please enter the number of Pies: ");
		int numberOfPies = input.nextInt();
		
		System.out.println(numberOfCookies);
		System.out.println(numberOfDonuts);
		System.out.println(numberOfCakes);
		System.out.println(numberOfPies);
		
	}

}

package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numberOfInputs = scan.nextInt();

		for(int i=1; i <= numberOfInputs; i++) {
			
			String firstName = scan.next();
			String lastName = scan.next();
			
			char firstLetter = firstName.charAt(0);
			
			int numberOfItemTypes = scan.nextInt();
			
			double total = 0;
			
			for(int j=1; j<=numberOfItemTypes; j++) {
			
				int numberOfItems = scan.nextInt();
				
				String nameOfItem = scan.next();
				
				double priceOfItem = scan.nextDouble();
				
				total += (numberOfItems * priceOfItem);
				
				
			}
			
			String s = String.format("%.2f", total);
			
			System.out.println(firstLetter + ". " + lastName + ": " + (s));
			
		}


		scan.close();
		
	}
}

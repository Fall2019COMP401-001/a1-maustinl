package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numberOfStoreItems = scan.nextInt();
		
		String[] allItems = new String[numberOfStoreItems];
		
		double[] allPrice = new double[numberOfStoreItems];

		for(int i=0; i < numberOfStoreItems; i++) {
		
			allItems[i] = scan.next();
			
			allPrice[i] = scan.nextDouble();
			
		}
		
		
		
		int numberOfPeople = scan.nextInt();
		
		String[] personFirstName = new String[numberOfPeople];
		
		String[] personLastName = new String[numberOfPeople];
		
		int[] personItems = new int[numberOfPeople];
		
		double[] fullPrice = new double[numberOfPeople];
		
		
		
		for(int j=0; j < numberOfPeople; j++) {
			
			personFirstName[j] = scan.next();
			
			personLastName[j] = scan.next();
			
			personItems[j] = scan.nextInt();
			
			double sum = 0.0;
			
			
			
			for(int k=1; k <= personItems[j]; k++) {
				
				int boughtInd = scan.nextInt();
				
				String itemName = scan.next();
				
				int indexFruit = fruitAndOther(itemName, allItems);
				
				double itemPriceInd = allPrice[indexFruit];
				
				sum += (boughtInd * itemPriceInd);		
			}
			
			fullPrice[j] = sum;
			
		}
		
		scan.close();
		
		String maxPerson = null;
		
		String minPerson = null;
		
		double averagePrice = 0.0;
				
		double spicySum = 0.0;
		
		double curMax = 0.0;
		
		double curMin = 0.0;
		
		
		for(int l=0; l < fullPrice.length; l++) {
			
			if(curMin == 0.0) {
				curMin = fullPrice[l];
				
				minPerson = personFirstName[l] + " "
						+ personLastName[l];
			}
			
			if(curMax < fullPrice[l]) {
				
				curMax = fullPrice[l];
				
				maxPerson = personFirstName[l] + " "
				+ personLastName[l];
				
				
				
			}
			
			if(curMin > fullPrice[l]) {
				
				curMin = fullPrice[l];
				
				minPerson = personFirstName[l] + " "
						+ personLastName[l];
				
			}
			
			spicySum += fullPrice[l];
			
			
			
		}

		averagePrice = (spicySum/fullPrice.length);
		
		String a = String.format("%.2f", curMax);
		
		String b = String.format("%.2f", curMin);
		
		String s = String.format("%.2f", averagePrice);
		
		System.out.println("Biggest: " + maxPerson + " (" + a + ")");
		System.out.println("Smallest: " + minPerson + " (" + b + ")");
		System.out.println("Average: " + s);
		
	}
	
	public static int fruitAndOther(String tmp, String[] allItems) {
		
		for(int i = 0; i < allItems.length; i++) {
			
			if(allItems[i].equals(tmp)) {
				return i;
			}
		}
		return 0;
		
	}
}

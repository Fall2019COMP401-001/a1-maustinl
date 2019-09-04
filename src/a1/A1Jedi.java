package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		int numberOfStoreItems = scan.nextInt();
		
		String[] allItems = new String[numberOfStoreItems];
		
		int[] itemsSold = new int[numberOfStoreItems];
		
		int[] peopleWhoBought = new int[numberOfStoreItems];
		
		
		
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
			
			boolean[] alreadyBought = new boolean[numberOfStoreItems];
			
			for(int k=0; k < personItems[j]; k++) {
				
				int boughtInd = scan.nextInt();
				
				String itemName = scan.next();
				
				int indexFruit = fruitAndOther(itemName, allItems);
				
				itemsSold[indexFruit] += boughtInd;
				
				double itemPriceInd = allPrice[indexFruit];
				
				sum += (boughtInd * itemPriceInd);
				
				alreadyBought[indexFruit] = true;

			
			}
			
			for(int i=0; i < numberOfStoreItems; i++) {
			
				if(alreadyBought[i] == true) {
				
					peopleWhoBought[i] += 1;
				
				}
			}
				fullPrice[j] = sum;
			
		}
		
		scan.close();

		
		for(int m = 0; m < numberOfStoreItems; m++) {
			
			int quantityBought = itemsSold[m];
			
			String itemBought = allItems[m];

			
			if(quantityBought == 0) {
				
				System.out.println("No customers bought " +
						itemBought);
			} else {
				System.out.println(peopleWhoBought[m] + " customers bought " +
						itemsSold[m] + " " +
						itemBought);
			}
			
		}
		
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

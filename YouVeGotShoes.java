/* 
 * Gabriella Bruno
 * Project 2
 * Title: YouVeGotShoes.java
 * Description: displays inventory and information of shoes
 * Date: 11/22/24
 */

import java.util.Scanner;

public class YouVeGotShoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		
		Shoe shoe1 = new Shoe("Adidas", "Samba", 50, 12345, 40);
		Shoe shoe2 = new Shoe("Nike", "Air Force 1", 100, 67890, 40);
		Shoe shoe3 = new Shoe("Converse", "Chuck Taylor", 40, 34567, 40);

		System.out.println("Enter the manufacturer of the 4th shoe:");
		String m = k.nextLine();
		
		System.out.println("Enter the name of the 4th shoe:");
		String n = k.nextLine();
		
		System.out.println("Enter the price of the 4th shoe:");
		double p = k.nextDouble();
		
		System.out.println("Enter the SKU of the 4th shoe:");
		int sku = k.nextInt();
		
		Shoe shoe4 = new Shoe(m, n, p, sku);
		
		System.out.println("\nShoe information before changes");
		System.out.println("-------------------------------");
		System.out.println(shoe1.toString());
		System.out.println("");
		System.out.println(shoe2.toString());
		System.out.println("");
		System.out.println(shoe3.toString());
		System.out.println("");
		System.out.println(shoe4.toString());
		
		//changing likes and price
		shoe4.like();
		shoe3.like(5);
		shoe2.like(-1);
		shoe1.setPrice(29.99);
		
		//decrease the price of the other three shoes by 20%
		shoe2.setPrice(shoe2.getPrice() - (shoe2.getPrice() * .2));
		shoe3.setPrice(shoe3.getPrice() - (shoe3.getPrice() * .2));
		shoe4.setPrice(shoe4.getPrice() - (shoe4.getPrice() * .2));

		//total price and average likes
		double totalPrice = shoe1.getPrice() + shoe2.getPrice() + shoe3.getPrice() + shoe4.getPrice();
		double totalLikes = shoe1.getLikes() + shoe2.getLikes() + shoe3.getLikes() + shoe4.getLikes();
		double averageLikes =  totalLikes / 4;
		
		System.out.println("\nShoe information after changes");
		System.out.println("-------------------------------");
		System.out.println(shoe1.toString());
		System.out.println("");
		System.out.println(shoe2.toString());
		System.out.println("");
		System.out.println(shoe3.toString());
		System.out.println("");
		System.out.println(shoe4.toString());
		System.out.println("");
		System.out.printf("Total price of shoes: $%.2f", totalPrice);
		System.out.println("\nAverage likes: " + averageLikes);
		
	}//end main
}//end class

/* 
 * console output:
 *
Enter the manufacturer of the 4th shoe:
Nike
Enter the name of the 4th shoe:
Air Jordan
Enter the price of the 4th shoe:
80
Enter the SKU of the 4th shoe:
45678

Shoe information before changes
-------------------------------
Manufacturer: Adidas
Name: Samba
Price: $50.0
SKU Number: 12345
Likes: 40

Manufacturer: Nike
Name: Air Force 1
Price: $100.0
SKU Number: 67890
Likes: 40

Manufacturer: Converse
Name: Chuck Taylor
Price: $40.0
SKU Number: 34567
Likes: 40

Manufacturer: Nike
Name: Air Jordan
Price: $80.0
SKU Number: 45678
Likes: 0

Shoe information after changes
-------------------------------
Manufacturer: Adidas
Name: Samba
Price: $29.99
SKU Number: 12345
Likes: 40

Manufacturer: Nike
Name: Air Force 1
Price: $80.0
SKU Number: 67890
Likes: 39

Manufacturer: Converse
Name: Chuck Taylor
Price: $32.0
SKU Number: 34567
Likes: 45

Manufacturer: Nike
Name: Air Jordan
Price: $64.0
SKU Number: 45678
Likes: 1

Total price of shoes: $205.99
Average likes: 31.25
 *
 */

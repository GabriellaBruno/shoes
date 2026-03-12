/* 
 * Gabriella Bruno
 * Project 2
 * Title: Shoe.java
 * Description: what each shoe has
 * Date: 11/22/24
 */
public class Shoe {

	private String manufacturer;
	private String name;
	private double price;
	private int skuNum;
	private int likes;
	
	//default constructor
	public Shoe() {
		manufacturer = "";
		name = "";
		price = 0;
		skuNum = 0;
		likes = 0;
	}
	
	//overloaded constructor 1, all variables
	public Shoe(String m, String n, double p, int s, int l) {
		manufacturer = m;
		name = n;
		price = p;
		skuNum = s;
		likes = l;
	}
	
	//overloaded constructor 2, all variables except likes
	public Shoe(String m, String n, double p, int s) {
		manufacturer = m;
		name = n;
		price = p;
		skuNum = s;
		likes = 0;
	}
	
	//toString
	public String toString() {
		String x = "Manufacturer: " + manufacturer + "\nName: " + name + "\nPrice: $" + price + "\nSKU Number: " + skuNum + "\nLikes: " + likes;
		return x;
	}
	
	//get and set for price, get for likes
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double p) {
		price = p;
	}
	
	public int getLikes() {
		return likes;
	}
	
	//like() method
	public void like() {
		likes++;
	}
	
	public void like(int x) {
			likes = likes + x;
	}
	
}//end class

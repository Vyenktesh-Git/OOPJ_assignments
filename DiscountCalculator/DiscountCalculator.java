package DiscountCalculator;



//4. Discount Calculation for Retail Sales
//Design a system to calculate the final price of an item after applying a discount. The system should:
//1.	Accept the original price of an item and the discount percentage from the user.
//2.	Calculate the discount amount and the final price using the following formulas:
//o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
//o	Final Price Calculation: finalPrice = originalPrice - discountAmount
//3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
//Define the class DiscountCalculator with fields, an appropriate constructor, 
//getter and setter methods, a toString method, and business logic methods. 
//Define the class DiscountCalculatorUtil with methods acceptRecord, printRecord, and menuList.
//Define the class Program with a main method to test the functionality of the utility class.

public class DiscountCalculator {

	private String name;
	private double price;
	private double discountPrice;
	public DiscountCalculator(String name, double price, double discountPrice) {
		super();
		this.name = name;
		this.price = price;
		this.discountPrice = discountPrice;
	}
	public DiscountCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	@Override
	public String toString() {
		return "DiscountCalculator [name=" + name + ", price=" + price + ", discountPrice=" + discountPrice + "]";
	}
	
	public double discountAmountCalculation(){
		
		double discountAmount = price * (discountPrice/100);
		return discountAmount;
	}
	
	public double calculateFinalPrice() {
        return price - discountAmountCalculation();
        
    }
}

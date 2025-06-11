public class ProfitCalculator {
	public static void main(String[] args) {
		// Create a variables to store cost price and selling price in INR
		int costPrice = 129, sellingPrice = 191;

		// Calculate profit and profit percentage
		int profit = sellingPrice - costPrice;
		double profitPercentage = ((double) profit / costPrice) * 100;

		// Display profit and profit percentage
		System.out.println("The Cost Price is INR " + costPrice +
				" and Selling Price is INR " + sellingPrice +
				"\nThe Profit is INR " + profit +
				" and the Profit Percentage is " + profitPercentage);
	}
}
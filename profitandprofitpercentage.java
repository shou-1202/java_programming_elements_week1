class profitandprofitpercentage{
public static void main(String[] args){
  int cost_price = 129; //declaring cost_price to store the cost price of the product
  int selling_price = 191; //declaring selling_price to store the selling price of the product
  int profit = selling_price - cost_price; //declaring variable profit to calculate the profit directly and storing it at the same time
  double profit_percentage = ((double)profit/(double)cost_price)*100;
  System.out.println("The Cost Price is INR "+cost_price+" and Selling Price is INR "+selling_price+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+profit_percentage); // The output is The Cost Price is INR 129 and Selling Price is INR 191
The Profit is INR 62 and the Profit Percentage is 48.06201550387597
}
}
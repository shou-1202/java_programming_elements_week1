class discountpercent{
public static void main(String[] args){
  int fee = 125000; //declaring variable to store the fee charged by the university
  int discountpercent = 10; //declaring variable to store the percent of discount
  double discount = ((double)fee*(double)discountpercent)/100; //calculating discount given
  double fee_after_discount = (double)fee - discount; //calculating charged fee after discount
  System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+fee_after_discount); // The output is The discount amount is INR 12500.0 and final discounted fee is INR 112500.0
}
}
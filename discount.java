import java.util.Scanner;
class discount{
public static void main(String[] args){
 int fee, discount; //declaring variables
 Scanner input = new Scanner(System.in); //opening scanner to take input from the user for fee and discount
 System.out.println("Enter fee amount: "); 
 fee = input.nextInt(); //storing value of fees in the fee variables
 System.out.println("Enter discount percentage: ");
 discount = input.nextInt(); //storing value of disocunt percentage
 double total_discount = ((double)fee*(double)discount)/100; //calculating discount on fee
 double fee_after_discount = (double)fee - total_discount; //calculating fee after discount
 System.out.println("The discount amount is INR "+total_discount+" and final discounted fee is INR "+fee_after_discount); //The output is The discount amount is INR 118750.0 and final discounted fee is INR 356250.0
 input.close(); //clossing scanner object
}
}
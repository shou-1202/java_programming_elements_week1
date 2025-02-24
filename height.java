import java.util.Scanner;
class height{
public static void main(String[] args){
  double height, inch = 2.54;// declaring height
  int feet = 12; // declaring variable
  Scanner input = new Scanner(System.in); //opening scanner to take input from the user 
  System.out.println("Enter height in cm: ");
  height = input.nextDouble(); //enter height in cm
  double height_in_feet = height/((double)feet*inch); // calculating height in feet
  double height_in_inch = height*(1/inch); //calculating height in inches
  System.out.println("Your Height in cm is "+height+" while in feet is "+height_in_feet+" and inches is "+height_in_inch); //The output is Your Height in cm is 13.4 while in feet is 0.43963254593175854 and inches is 5.275590551181102
  input.close(); // clossing scanner object
}
}
  
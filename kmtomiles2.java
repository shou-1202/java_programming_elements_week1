import java.util.Scanner;
class kmtomiles2{
public static void main(String[] args){
  double km; //declaring variable
  Scanner input = new Scanner(System.in); //using scanner to take input from the user
  System.out.println(" Enter distance in km: "); //asking user to enter distance
  km = input.nextInt(); //storing the user given value in km variable
  double miles = 1.6;
  System.out.println("The total miles is "+km*miles+" mile for the given "+km+" km");// The output is The total miles is 8.0 mile for the given 5.0 km
  input.close(); //closing the scanner object  
}
}

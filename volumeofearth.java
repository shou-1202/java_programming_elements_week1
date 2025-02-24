class volumeofearth{
public static void main(String[] args){
  int radius_of_earth_in_km = 6378; //declaring variable to store the value of radius in km
  double volume_in_km = (4/3)*3.14*(double)radius_of_earth_in_km*(double)radius_of_earth_in_km*(double)radius_of_earth_in_km; //calculating volume in km
  double radius_of_earth_in_miles = 6378*1.6; //calculating radius in miles
  double volume_in_miles = (4/3)*3.14*radius_of_earth_in_miles*radius_of_earth_in_miles*radius_of_earth_in_miles; // calculating volume in miles
  System.out.println("The volume of earth in cubic kilometers is "+volume_in_km+" and cubic miles is "+volume_in_miles); //the output is The volume of earth in cubic kilometers is 8.1467275555728E11 and cubic miles is 3.33689960676262E12
}
}
  
  
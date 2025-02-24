class pendivision{
public static void main(String[] args){
  int no_of_pens = 14;// total no of pens
  int no_of_students = 3;// total no of students
  int pens_left_undistributed = no_of_pens%no_of_students;// calculating pens which cannot be distributed
  int pens_per_student = no_of_pens/no_of_students;// calculating pens per student
  System.out.println("The Pen Per Student is "+pens_per_student+" and the remaining pen not distributed is "+pens_left_undistributed); // the output is The Pen Per Student is 4 and the remaining pen not distributed is 2
}
}
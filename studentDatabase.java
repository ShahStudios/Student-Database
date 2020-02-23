package ShahStudentDatabase;

import java.util.Scanner;

public class studentDatabase {

	public static void main(String [] args) {
	
		// ask user to enter how many students he/she wants to add 
		System.out.print(" How many new students would you like to enroll: ");
		Scanner input = new Scanner(System.in);
		int numStudents = input.nextInt();
		
		// create array for new students
		Student [] students = new Student[numStudents];
		for (int i = 0; i < numStudents; i++) {
			// create student object
			students[i] = new Student();
			// call the enroll method for the new student object created
			students[i].enroll();
			// call the pay tuition method for new student object created
			students[i].payTuition();
			// call the show status method for new student object created
			System.out.println(students[i].showStatus());
		}
	}
}
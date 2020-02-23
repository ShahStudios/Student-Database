package ShahStudentDatabase;
import java.util.Scanner;

public class Student {
	
	// use encapsulation for declaring variables
	private String firstName, lastName, studentCourses, studentID;
	private int tuitionBalance = 0, gradeYear;
	private static int courseCost = 800;
	private static int id = 1000;
	
	// constructor to ask user to enter students name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the student's first name: ");
		this.firstName = input.nextLine();
		System.out.print("Enter the student's last name: ");
		this.lastName = input.nextLine();
		System.out.print("\n Class Year Details \n 1: Freshmen \n 2: Sophmore \n 3: Junior \n 4: Senior \n Enter what class year the student is in: ");
		this.gradeYear = input.nextInt();
		
		
		// call setStudentID (which will increment id by one and combine gradeYear with studentID)
		setStudentID();
		
		// test to see if the user inputs is working 
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
		
		
		
	}
	
	
	// generate student id
	private void setStudentID() {
		// take class year and add studentID with it (increment the id for each new student added to the database)
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	
	// student enrollment 
	public void enroll() {
		
		do {
			System.out.print("Enter what course you'd like to enroll in (enter quit to EXIT): "); 
		
			Scanner input = new Scanner(System.in);
			String course = input.nextLine();
				if (!course.contentEquals("EXIT")) {
					studentCourses = studentCourses + "\n" + course;
					tuitionBalance = tuitionBalance + courseCost;
				} else {
					System.out.println("Break!");
					break;
				}
		} while (1 != 0);
		
		System.out.println("Enrolled In: " + studentCourses);
		System.out.println("Tuition Balance Total: " + tuitionBalance);
	}
}

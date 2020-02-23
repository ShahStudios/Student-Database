package ShahStudentDatabase;
import java.util.Scanner;

public class Student {
	
	// use encapsulation for declaring variables
	private String firstName, lastName, studentCourses="", studentID;
	private int tuitionBalance = 0, gradeYear;
	private static int courseCost = 800;
	private static int id = 1000;
	
	// constructor to ask user to enter students name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.print(" Please enter your first name: ");
		this.firstName = input.nextLine();
		System.out.print(" Please enter your last name: ");
		this.lastName = input.nextLine();
		System.out.print("\n Class Year Details \n 1: Freshman \n 2: Sophmore \n 3: Junior \n 4: Senior \n Please enter what class year you are in: ");
		this.gradeYear = input.nextInt();
		// call setStudentID (which will increment id by one and combine gradeYear with studentID)
		setStudentID();
		
		// test to see if the user inputs is working 
		// System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	

	// generate student id
	private void setStudentID() {
		// take class year and add studentID with it (increment the id for each new student added to the database)
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	
	// let student enroll into courses based off his course year
	public void enroll() {
		do {
			if (gradeYear == 1) {
				System.out.println("\n Freshman Available Courses: \n"
						+ "  CSCI 1100: Computer Science\n"
						+ "  CSCI 1200: Data Structures\n"
						+ "  MATH 1010: Calculus I\n"
						+ "  MATH 1020: Calculus II\n"
						+ "  PHYS 1105: Physics I2\n"
						+ "  BIOL 1013: Intro to Biology\n"
						+ "  BIOL 1015: Intro. to Biology Lab2");
				System.out.print("\n Enter what course you'd like to enroll in with the course subject and course number (to exit please enter: exit): ");
				Scanner input = new Scanner(System.in);
				String course = input.nextLine();
				if (!course.equalsIgnoreCase("exit")) {
					studentCourses = studentCourses + "\n " + course;
					tuitionBalance = tuitionBalance + courseCost;
				}
				else {
					break;
				} 
			} 
			if (gradeYear == 2) {
				System.out.println("\n Sophmore Available Courses: \n"
						+ "  CSCI 2200: Foundations of CS\n"
						+ "  CSCI 2500: Computer Organization\n"
						+ "  MATH 2001: AlgorithmII\n"
						+ "  CSCI 2300: Intro. to Algorithms\n"
						+ "  CSCI 2600: Principles of Software\n");
				System.out.print("\n Enter what course you'd like to enroll in with the course subject and course number (to exit please enter: exit): ");
				Scanner input = new Scanner(System.in);
				String course = input.nextLine();
				if (!course.equalsIgnoreCase("exit")) {
					studentCourses = studentCourses + "\n " + course;
					tuitionBalance = tuitionBalance + courseCost;
				}
				else {
					break;
				} 
			} 
			if (gradeYear == 3) {
				System.out.println("\n Junior Available Courses: \n"
						+ "  CSCI 4210: Operating Systems\n"
						+ "  CSCI 4430: Programming Languages\n"
						+ "  SCI 4400: Option 1\n"
						+ "  CSCI 2700: Intro. to AlgorithmsII\n"
						+ "  CSCI 2800: Principles of Data Structures\n");
				System.out.print("\n Enter what course you'd like to enroll in with the course subject and course number (to exit please enter: exit): ");
				Scanner input = new Scanner(System.in);
				String course = input.nextLine();
				if (!course.equalsIgnoreCase("exit")) {
					studentCourses = studentCourses + "\n " + course;
					tuitionBalance = tuitionBalance + courseCost;
				}
				else {
					break;
				} 
			} 			
			if (gradeYear == 4) {
				System.out.println("\n Senior Available Courses: \n"
						+ "  CSCI 4430: Programming Languages\n"
						+ "  CSCI 4500: Computer Organization\n"
						+ "  CSCI 4600: Principles of Software\n"
						+ "  CSCI 4900: Data Structures\n");
				System.out.print("\n Enter what course you'd like to enroll in with the course subject and course number (to exit please enter: exit): ");
				Scanner input = new Scanner(System.in);
				String course = input.nextLine();
				if (!course.equalsIgnoreCase("exit")) {
					studentCourses = studentCourses + "\n " + course;
					tuitionBalance = tuitionBalance + courseCost;
				}
				else {
					break;
				} 
			} 					
			else {
				System.out.println("\nSorry, but you have selected an invalid input. \nPlease contact: shah@support.edu");
				System.exit(0);
			}
		} while (1 != 0);
	}
			
			
			
	// student tuition balance 
	public void viewBalance() {
		System.out.println(" Your current balance due is: $" + tuitionBalance);
	}

	// let student pay tuition cost and view balance after 
	public void payTuition() {
		viewBalance();
		Scanner input = new Scanner(System.in);
		System.out.print(" If you'd like to make a payment towards your balance due. Please enter your payment amount (if not enter 0): $");
		int payment = input.nextInt();
		
		if (!(payment == 0)) {
			tuitionBalance = tuitionBalance - payment;
			System.out.println("\n Thank you for your payment of $" +  payment);
			viewBalance();
		}
		else {
			System.out.println("\n Please make sure to pay off your balance in the near future. Current balance amount due is below.");
			viewBalance();
		} 	
	}


	// show full student status
	public String showStatus() {
		return "\n Student Information: \n" + " Full Name: " + firstName + " " + lastName + "\n" +
				" Grade Year: " + gradeYear + 
				"\n Courses Enrolled: " + "    " + studentCourses + 
				"\n Balance Due: " + tuitionBalance;
	}
}
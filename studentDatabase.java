package ShahStudentDatabase;

public class studentDatabase {

	public static void main(String [] args) {
	
	Student studentOne = new Student();
	studentOne.enroll();
	studentOne.payTuition();
	System.out.println(studentOne.showStatus());
	}
	
}

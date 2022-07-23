package week3.day1;

public class Students {

	public void getStudentInfo() {
		System.out.println("Student Info");
	}
	
	public void getStudentInfo(String studentID) {
		System.out.println("Student Id: " +studentID);
	}
	
	public void getStudentInfo(String studentID, String name) {
		System.out.println("Student ID & Name: " +studentID +name);
	}
	public void getStudentInfo(String email, long phoneNumber ) {
		System.out.println("Student E-mail & Phone Number: " +email +phoneNumber);
	}
	
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo();
		info.getStudentInfo("071CS112");
		info.getStudentInfo("071CS112 ", "Aarya");
		info.getStudentInfo("arya@gmail.com ", 98213453712L);
	}
}

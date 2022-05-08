package week3.day3;

public class Students {

	public static void getStudentInfo(int id, String name) {
		System.out.println("Student ID: "+ id);	
		}
	
	public static void getStudentInfo(short name) {
		System.out.println("Student name: " +name);		
		}
	public static void getStudentInfo(long phoneNumber) {
		System.out.println("Student Email: "+phoneNumber);		
		}

	public static void getStudentInfo(String email) {
		System.out.println("Student PhoneNumber: " +email);
	
	}
	public static void main (String[] args) {
		
		getStudentInfo(232434);
		getStudentInfo("Malar");
		getStudentInfo(9876543212l);
		getStudentInfo("malar@gmail.com");	
	}
}

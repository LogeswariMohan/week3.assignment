//Assignment 4:
//==============
//
//      Class: Students
//      Methods: getStudentInfo()
//
//Description: 
//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber

package week3.assignmentss;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("id = "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("StuId = "+id+" , "+"stuName = "+name);
	}
	public void  getStudentInfo(String email, long number) {
		System.out.println("email = "+email +" , "+ "phoneNumber = "+number);
	}
	public static void main(String[] args) {
		
		Students s = new Students();
		s.getStudentInfo(304);
		s.getStudentInfo(105, "Logeswari");
		s.getStudentInfo("logi@gmail.com", 938512394);
	}

}

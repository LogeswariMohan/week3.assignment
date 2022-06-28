package week3.assignmentss;

public class AxisBank extends BankInfo{
	
	public float deposit() {
		float deposit = 5000.50f;
		return deposit;
	}
	public static void main(String[] args) {
		
		AxisBank ab = new AxisBank();
		
		System.out.println(ab.deposit());
		
		
	}

}

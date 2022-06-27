package week3.assignments.org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		float size = 19.45f;
		System.out.println("Desktop size is "+size);
	}
	public static void main(String[] args) {
		
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}


public class ThreadCreationExample {
	public static void main(String[] args) {
		
		
		Thread1 t1 = new Thread1();
		t1.start();
		
		
		Thread t2 = new Thread(new Thread2());
		t2.start();
	}

}

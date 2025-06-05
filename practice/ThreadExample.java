package practice;
class car extends Thread{
	public void run(){
		for(int i=1;i<=3;i++) {
			System.out.println("car is moving "+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
		
	}
}
class bike extends Thread{
	public void run(){
		for(int i=1;i<=3;i++) {
			System.out.println("BIKE is moving"+i);
			try {
				Thread.sleep(500);
			}
			catch(Exception e) {
				
			}
		}
		
	}
	
}

public class ThreadExample {

	public static void main(String[] args) {
		new car().start();
		new bike().start();
	}

}
=

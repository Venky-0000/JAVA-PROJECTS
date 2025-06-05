package practice;
class car implements Runnable{
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
class bike implements Runnable{
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

public class InterfaceExamole2 {
	public static void main(String[] args) {
		Thread carThread=new Thread(new car());
		Thread bikeThread=new Thread(new bike());
		System.out.println("Gooo-");
		carThread.start();
		bikeThread.start();
		
	}

}

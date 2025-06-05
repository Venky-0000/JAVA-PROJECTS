package practice;
class MyTask extends Thread{
	private String taskname;
	public MyTask(String taskname){
		this.taskname=taskname;
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(taskname+" Steps "+i);
			try {
				Thread.sleep(5000);
			}
			catch(InterruptedException e) {
				System.out.println(taskname+" was interrupted. ");
			}
		}
	}
}

public class SimpleConcurrency {

	public static void main(String[] args) {
		MyTask t1=new MyTask("Cooking");
		MyTask T2=new MyTask("Washing");
		t1.start();
		T2.start();
	}

}

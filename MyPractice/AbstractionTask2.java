package MyPractice;

abstract class AbstractionTask2 {
	abstract void start();
	abstract void drive();
	abstract void stop();
	void musicSystem() {
		System.out.println("Playing Music");
	}
}
public class DailyPractice{
	void start() {
		System.out.println("Car Starts");
	}
	void drive() {
		System.out.println("Car is Driving Mode Now");
	}
	void stop() {
		System.out.println("Car has stopped");
	}
	public static void main(String[] args) {
		

	}

}

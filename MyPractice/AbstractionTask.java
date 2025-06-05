package MyPractice;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractionTask {
	void carDriving() {
		System.out.println("required features for driving car are:");
		List<String> features=new ArrayList<String>();
		features.add("Steering");
		features.add("Gear System");
		features.add("Clutch");
		features.add("Accelerator");
	}

	public static void main(String[] args) {
		AbstractionTask ab=new AbstractionTask();
		ab.carDriving();
	}

}

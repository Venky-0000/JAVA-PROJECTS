package practice;
class Car{
	public void BMW(){
		for(int i=1;i<=3;i++) {
			System.out.println("car is moving "+i);
		}
		
	}
}
class Bike{
	public void NINJA(){
		for(int i=1;i<=3;i++) {
			System.out.println("BIKE is moving"+i);
		}
		
	}
	
}

public class simpleRace {

	public static void main(String[] args) {
		car c=new car();
		c.BMW();
		Bike b=new Bike();
		b.NINJA();
	}

}

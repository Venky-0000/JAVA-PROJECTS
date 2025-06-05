package practice;
class animal{
	void sound() {
		System.out.println("Animals make different sound");
	}
	class dog extends animal{
		void sound() {
			System.out.println("Dog Barks");
		}
	}
		class cat extends animal{
			void sound() {
				System.out.println("cat meows");
			}
		}
}
public class MethodOverriding {
	public static void main(String[] args) {
		animal a1=new animal();
		
	}

}

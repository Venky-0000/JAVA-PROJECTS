package MyPractice;

public class Oopstask {
		private String name;
		private int rollNo;
		private int marks;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public int getMarks() {
			return marks;
		}
		public void setMarks(int marks) {
			this.marks = marks;
		}
		public String checkResult() {
			if(marks>=40) {
				return "Pass";
			}
			else {
				return "Fail";
			}
			
		}
		public void displayDetails() {
			System.out.println("Roll no "+getRollNo());
			System.out.println("Name "+getName());
			System.out.println("Marks "+getMarks());
			System.out.println("Result "+checkResult());
		}
		public static void main(String[] args) {
			Oopstask s1=new Oopstask();
			s1.setMarks(40);
			s1.setName("Ram");
			s1.setRollNo(1234);
			s1.displayDetails();
		}
}

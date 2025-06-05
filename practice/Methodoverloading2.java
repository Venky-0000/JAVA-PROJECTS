package practice;

class calculator {
    int calculate(int a, int b) {
        return a + b;
    }
    double calculate(double a, double b) {
        return a - b;
    }
    float calculate(float a,float b,float c) {
        return a * b * c;
    }
}

public class Methodoverloading2 {
    public static void main(String[] args) {
        calculator cc = new calculator();
        System.out.println(cc.calculate(10, 20));          
        System.out.println(cc.calculate(10.345, 20.345));   
        System.out.println(cc.calculate(10.5, 20.6, 40.8)); 
    }
}

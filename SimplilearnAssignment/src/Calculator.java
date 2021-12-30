
public class Calculator {
	int powerInt(int num1,int num2){
		int power=1;
		while(num2!=0){
			power=num1*power;
			num2--;
		}
		return power;
	}
	double powerDouble(double num1,int num2){
		double power1=1;
		while(num2!=0){
			power1=num1*power1;
			num2--;
		}
		return power1;
	}
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		System.out.println(calculator.powerInt(4,3));
		System.out.println(calculator.powerDouble(5.2,2));

	}
}

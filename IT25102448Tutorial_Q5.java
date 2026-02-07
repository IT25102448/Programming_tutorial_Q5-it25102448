class calculator{
	
	public static int add(int a, int b){
		return a + b;
	}
	
	public static int multiply(int a, int b){
		return a * b;
	}
	
	public static int square(int a){
		return a * a;
	}
}

public class IT25102448Tutorial_Q5{
	
	public static void main(String[] args){
		
		calculator cal = new calculator();
		
		int result1 = cal.square(cal.add(cal.multiply(3, 4),cal.multiply(5, 7)));
		System.out.println("(3*4 + 5*7)^2 = " + result1);
		
		int result2 = cal.add(cal.square(cal.add(4, 7)),cal.square(cal.add(8, 3)));
		System.out.println("(4+7)^2 + (8+3)^2 = " + result2);
		
	}
}
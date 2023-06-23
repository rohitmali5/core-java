public class returnClass{
	public static void main(String[] args){
	
	int addedValue = add();
	System.out.println(addedValue);
	
	sub();
	
	long devideValue = devide();
	System.out.println(devideValue);
	
	char iteratedValue = iterate();
	System.out.println(iteratedValue);
	
	long multiplyValue = multiply();
	System.out.println(multiplyValue);
	
	double modValue = mod();
	System.out.println(modValue);
	
	float divisionValue = division();
	System.out.println(divisionValue);
	
	byte additionvalue = addition();
	System.out.println(additionvalue);
	
	short substractionValue = substraction();
	System.out.println(substractionValue);
	
	checkStatement();
	
	
	}
	public static int add(){
		int a = 10;
		int b = 20;
		int c = a+b;
		return c;
	
	}
	
	public static void sub(){
		int a = 30;
		int b = 20;
		int c = a - b;
		System.out.println(c);
		
	}
	
	public static long devide(){
		long a = 50;
		long b = 25;
		long c = a/b;
		return c;
		
	}
	
	public static char iterate(){
		System.out.println("method iterate starts");
		return 's';
		
	}
	public static long multiply(){
		long a = 4867644671l;
		long b = 7167131682l;
		long c = a*b;
		return c;
		
	}
	
	public static double mod(){
		double a = 21;
		double b = 4;
		double c = a%b;
		return c;
		
	}
	
	public static float division(){
		float s = 45645f;
		float k = 25445f;
		float d = s/k;
		return d;
	}
	
	public static byte addition(){
		int a = 7;
		int b = 6;
		int z = a+b;
		return z;
	}
	
	public static short substraction(){
		short a = 1000;
		short b = 845;
		int c = a-b;
		return c;
		
	}
	public static boolean checkStatement(){
		if(age>18){
			System.out.println("Eligible for voting");
			return true;
		}
		else{
			System.out.println(" Not eligible for voting");
		}
		
		
	}



}
public class ParameterExamples{
	public static void main(String[] args){
	boolean primeValue = isPrime(15);
	System.out.println(primeValue);
	
	int m=add(10,20,30);
	
	long multiplyValue = multiply(6,8);
	System.out.println(multiplyValue);
	
	double divisionValue = division(50,10);
	System.out.println(divisionValue);
	
	int addedValue = add(10,20,30,40,50,60);
	System.out.println(addedValue);
	
	int subValue = substract(30,50);
	System.out.println(subValue);
	
	boolean ceckingNumber = checkNumber(1,2);
	System.out.println(ceckingNumber);
	
	
	}
	public static boolean isPrime(int number){
	if(number%2 == 0){
		System.out.println("The number is prime");
		return true;
	}
	else{
		System.out.println("The number not is prime");
		return false;
	}
	}
	public static int add(int a,int b,int d){
		int h = a+b+d;
		if(h>0){
			System.out.println("Positive value");
			return h;
		}
		else{
			System.out.println("Negetive value");
		    return 0;
		}
	}
	
	public static long multiply(int a,int b){
		int c = a*b;
		if(c>0){
			System.out.println("Result is positive value");
			return c;
		}
		else{
			System.out.println("Result is Negative value");
			return 0;
		}
		
	}
	
	
	public static double division(int a,int b){
		int d = a+b;
		if(b==0){
			System.out.println("Give devide by zero error");
			return 0;
		}
		else{
			System.out.println("Give the result");
			return d;
		}
		
	}
	
	public static int add(int a, int b,int c,int d,int e,int f){
		int g = a+b+c+d+e+f;
		
		
		if(g>0){
			System.out.println("Added result");
			return g;
		}
		else{
			System.out.println("Not return the value");
			return 0;
		}
	}
	
	public static int substract(int a,int b){
		int c = a-b;
		if(a<b){
			System.out.println("Give negative value");
			return c;
		}
		else{
			System.out.println("Give positive value");
			return c;
		}
	}
	
	public static boolean checkNumber(int a, int b){
		int c = a/b;
		if(c%2==0){
			System.out.println("Given number is even");
			return true;
		
		}
		else{
			System.out.println("Given number is odd");
			return false;
		}
		
	}
		
}
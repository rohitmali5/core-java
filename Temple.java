public class Temple{
	public static void main(String[] args){
		int value = area(10);      //calling method with int value1
		System.out.println(value);
		
		int area = area(10 , 20);  //calling method with int value1 , int value2
		System.out.println(area);
		
		int area1 = area(10 , (byte)30);  //calling method with int value1 , byte value2
		System.out.println(area1);
		
		int area2 = area((byte)10 , (byte)30);  //calling method with byte value1,byte value2
		System.out.println(area2);
		
		int area3 = area((short)10 , 4.8d);  //calling method with short value1,double value2
		System.out.println(area3);
		
		int area4 = area(3.5d , (short)30);  //calling method with double value1,short value2
		System.out.println(area4);
		
		float weather = weatherCondition(10,50);  //calling method with int n1, int n2
		System.out.println(weather);
		
		float weather1 = weatherCondition(10,50,20);  //calling method with int n1, int n2, int n3
		System.out.println(weather1);
		
		float weather2 = weatherCondition(10,5.0f);  //calling method with int n1, float n2
		System.out.println(weather2);
		
		float weather3 = weatherCondition(1.0f,5.0f);  //calling method with float n1, float n2
		System.out.println(weather3);
		
		float weather4 = weatherCondition((short)10,5.0d);  //calling method with short n1, double n2
		System.out.println(weather4);
		
		float weather5 = weatherCondition(1.0d,(short)50);  //calling method with double n1, short n2
		System.out.println(weather5);
		
		float result = driveCar(8,4);  //calling method with int num1, int num2
		System.out.println(result);
		
		float result1 = driveCar(9,4,6);  //calling method with int num1, int num2, int num3
		System.out.println(result1);
		
		float result2 = driveCar(4,4.8f);  //calling method with int num1, float num2
		System.out.println(result2);
		
		float result3 = driveCar(5.3f,4.4f);  //calling method with float num1, float num2
		System.out.println(result3);
		
		float result4 = driveCar((short)5,4.76d);  //calling method with short num1, double num2
		System.out.println(result4);
		
		float result5 = driveCar(3.8d,(short)4);  //calling method with double num1, short num2
		System.out.println(result5);
	}
	public static int area(int value1){
		return value1;
	}
	public static int area(int value1 , int value2){
		
		return value1*value2;
	}
	public static int area(int value1 , byte value2){
		return value1-value2;
	}
	public static int area(byte value1 , byte value2){
		return value1*value2;
	}
	public static int area(short value1 , double value2){
		return value1;
	}
	public static int area(double value1 , short value2){
		return value2;
	}
	public static float weatherCondition(int n1 , int n2){
		
		return n1;
	}
	public static float weatherCondition(int n1 , int n2 , int n3){
		return n1*n2;
	}
	public static float weatherCondition(int n1 , float n2){
		return n1-n2;
	}
	public static float weatherCondition(float n1 , float n2){
		return n1*n2;
	}
	public static float weatherCondition(short n1 , double n2){
		return n1;
	}
	public static float weatherCondition(double n1 , short n2){
		return n2;
	}
	public static float driveCar(int num1, int num2){
		return num1;
	}
	public static float driveCar(int num1, int num2 , int num3){
		return num1*num2;
	}
	public static float driveCar(int num1, float num2){
		return num1-num2;
	}
	public static float driveCar(float num1, float num2){
		return num1*num2;
	}
	public static float driveCar(short num1, double num2){
		return num1;
	}
	public static float driveCar(double num1, short num2){
		return num2;
	}
	}
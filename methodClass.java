public class methodClass{
	public static void main(String[] args){
	
	iterate();
	add();
	vowels();
	arrayMethod();
	variableDeclaration();
	
	}
	public static void iterate(){
		byte[] numberOfRacks = new byte[10];
		numberOfRacks[0] = 1;
		numberOfRacks[1] = 2;
		numberOfRacks[2] = 3;
		numberOfRacks[3] = 4;
		numberOfRacks[4] = 5;
		numberOfRacks[5] = 6;
		numberOfRacks[6] = 7;
		numberOfRacks[7] = 8;
		numberOfRacks[8] = 9;
		numberOfRacks[9] = 10;
		for(int i=0;i<10;i++){
			System.out.println(numberOfRacks[i]);
		}
		
	}
	public static void add(){
		int[] rollNumber = {10,20,30,40,50};
		for (int i = 0; i<5;i++){
			System.out.println(rollNumber[i]);
		}
	}
	
	public static void vowels(){
		char[] vowels = {'a','e','i','o','u'};
		for(byte i= 0;i<5;i++){
			System.out.println(vowels[i]);
		}
	}
	
	public static void arrayMethod(){
		int[] oddNumbers = {1,3,5,7,9,11,13,15,17,19};
		for(int i = 0;i<10;i++){
			System.out.println(oddNumbers[i]);
			
		}
		
	}
	
	public static void variableDeclaration(){
		byte[] numberOfClasses = {1,2,3,4,5,6,7,8,9};
		for (int i=0;i<9;i++){
		System.out.println(numberOfClasses[i]);
		}
	}
	
	

}
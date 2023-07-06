public class WashingMachine{
	public static void main(String[] args){
		
		turnOn();
		char returnedValue = giveVowel();
		System.out.println(returnedValue);
		int n=add(4,2);
		System.out.println(n);
	}
	
	public static void turnOn(){
		long acNo = 8926872646l;
		if(acNo>0){
			System.out.println("Account number is valid");
			return;
		}
		else{
			System.out.println("Account number is invalid");
			return;
		}
	}
	
	public static char giveVowel(){
		System.out.println("method started");
		return 'a';
	}
	public static int add(int a ,int b){
		int c=a+b;
		return c;
	}


}
public class newArray{
	public static void main(String[] args){
	
	int[] rollNumber = {10,15,20,30,40};
	System.out.println(rollNumber[3]);
	
	int[] evenNumbers = {2,4,6,8,10};
	System.out.println(evenNumbers[0]);
	
	int[] oddNumbers = {1,3,5,7,9,11};
	System.out.println(oddNumbers[4]);
	
	int[] employeeId = {100,101,102,103,104};
	System.out.println(employeeId[3]);
	
	int[] roomNumber = {200,201,203,204,205};
	System.out.println(roomNumber[0]);
	
	char[] myNameCharecters = {'r','o','h','i','t'};
	System.out.println(myNameCharecters[4]);
	
	char[] vowels = {'a','e','i','o','u'};
	System.out.println(vowels[2]);
	
	char[] bloodGroup = {'a','b'};
	System.out.println(bloodGroup[1]);
	
	char[] alphabates = {'b','c','d','e','f','g'};
	System.out.println(alphabates[2]);
	
	char[] name = {'a','k','a','s','h'};
	name[2] = 'p';
	name[3] = 'm';
	System.out.println(name[3]);
	
	float[] cgpaOfStudent = new float[16];
	cgpaOfStudent[14] = 8.6f;
	for (int i=0; i<cgpaOfStudent.length;i++){
		System.out.println(cgpaOfStudent[i]);
	}	
	
	float[] roomTemperature = new float[100];
	roomTemperature[14] = 25.6f;
	for(int i=0;i<100;i++){
		System.out.println(roomTemperature[1]);
	}
	int[] rollNo = new int[10];
	rollNo[0] = 10;
	rollNo[1] = 11;
	rollNo[2] = 12;
	rollNo[3] = 13;
	rollNo[4] = 14;
	rollNo[5] = 15;
	rollNo[6] = 16;
	
	
	for(int i=0;i<10;i++){
		System.out.println(rollNo[i]);
	}
	int[] roadNo = new int[20];
	roadNo[2] = 9;
	roadNo[1] = 8;
	roadNo[3] = 2;
	roadNo[4] = 1;
	roadNo[2] = 9;
	for(int i=20;i>20;i--){
		System.out.println(roadNo[i]);
	}
	char[] englishVowels = new char[5];
	englishVowels[3] = 'o';
	
	
	char[] englishAlphabate = new char[4];
	englishAlphabate[0] = 'b';
	englishAlphabate[1] = 'c';
	englishAlphabate[3] = 'd';
	englishAlphabate[2] = 'f';
	
	for(int i=20;i>20;i--){
		System.out.println(englishAlphabate[i]);
	}
	long[] constantValues = new long[3];
	constantValues[2] = 356588888l;
	constantValues[0] = 894798988l;
	constantValues[1] = 817168298l;	
	for (int i=0; i<constantValues.length;i++){
		System.out.println(constantValues[i]);
	}
	long[] population = new long[2];
	population[1] = 14200000;
	population[0] = 15155286;
	
	byte[] rackNo = new byte[10];
	rackNo[0] = 1;
	rackNo[1] = 2;
	rackNo[9] = 10;
	rackNo[2] = 3;
	rackNo[3] = 4;
	rackNo[4] = 5;
	rackNo[6] = 8;
	
	byte[] crossNo = new byte[12];
	crossNo[5] = 6;
	
	

	
	
	}



}
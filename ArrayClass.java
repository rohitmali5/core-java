public class ArrayClass{
	public static void main(String[] args){
	
	int[] numOfStudents = {10,20,30,40};
	System.out.println(numOfStudents[0]);
	
	float[] cgpaOfStudent = new float[16];
	cgpaOfStudent[14] = 8.6f;
	
	for (int i=0; i<cgpaOfStudent.length;i++){
		System.out.println(cgpaOfStudent[i]);
		
	
	
	char[] vowels = {'a','e','i','o','u'};
	System.out.println(vowels[2]);
	
	for(int i = 0;i<5; i++){ //i<vowels.length if we don't know the size of array
		System.out.println(vowels[i]);
		
		//vowels[2] = 'r';
		//System.out.println(vowels[2]);
	}
	
	}
}
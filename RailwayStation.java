public class RailwayStation{

	int number;
	long accNo;
	int  rollNo;
	char grade;
	double phNumber;
	
	
	public RailwayStation(){
		System.out.println("Default Constructor");
		System.out.println(number);
	
	}
	public RailwayStation(int number1,long accNumber,int rollNumber,char grades,double phNumbers){
		number = number1;
		accNo = accNumber;
		rollNo = rollNumber;
		grade = grades;
		phNumber = phNumbers;
		
	
	
	}
	
	public static void main(String[] args){
	new RailwayStation();
	
	
	RailwayStation b = new RailwayStation(12,65646465446l,25,'A',7406462547d);
	System.out.println(b.number);
	System.out.println(b.accNo);
	System.out.println(b.rollNo);
	System.out.println(b.grade);
	System.out.println(b.phNumber);
	
	
	}

}
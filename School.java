public class School{

	static String faculty;
	static String subject;
	static int standard;
	static String examDate;
	static int fees;
	
	int rollNo;
	String busRoute;
	String nameOfStudent;
	int noOfStudentsInEachClass;
	int numberOfBoys;
	
	static{
		faculty = "Prof.A.A.Patil";
		subject = "Maths";
		standard = 5;
		examDate = "April 10";
		fees = 20000;
	}
	
	public School(int rollNo,String busRoute,String nameOfStudent,int noOfStudentsInEachClass,int numberOfBoys){
		this.rollNo = rollNo;
		this.busRoute = busRoute;
		this.nameOfStudent = nameOfStudent;
		this.noOfStudentsInEachClass = noOfStudentsInEachClass;
		this.numberOfBoys = numberOfBoys;
		
	}
	
	
	public static void main(String[] args){
		
	School school = new School(10,"Mejestic","Suraj",45,26);
	System.out.println("Object School is Running");
	
	School school1 = new School(11,"K R pura","Sagar",46,27);
	System.out.println("Object School1 is Running");
	
	School school2 = new School(12,"BTM","Akash",50,25);
	System.out.println("Object School2 is Running");
	
	School school3 = new School(13,"Banshankari","Pratap",51,28);
	System.out.println("Object School3 is Running");
	
	School school4 = new School(14,"HSR","Sanket",52,29);
	System.out.println("Object School4 is Running");

	}

}


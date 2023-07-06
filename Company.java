class Company {

		int marks;
		char grade;
		String name;
		boolean check;
		float percentage;
		
		public Company()
		{
			System.out.println("default constructor");
			System.out.println(name);
			System.out.println(marks);
			
		}
		public Company(int markss,char gradess,String names,boolean checks,float percentages)
		{
			System.out.println("chair method");
			marks = markss;
			grade = gradess;
			name = names;
			check = checks;
			percentage = percentages;
	
		}
		
		public static void main(String[] args)
		{
			new Company();
			System.out.println("------------");
			Company c = new Company(80,'a',"priya",true,87.2f);
			Company c1 = new Company(90,'A',"nayana",false,94.5f);
			System.out.println(c.marks);
			System.out.println(c.grade);
			System.out.println(c.name);
			System.out.println(c.check);
			System.out.println(c.percentage);
			
			System.out.println(c1.marks);
			System.out.println(c1.grade);
			System.out.println(c1.name);
			System.out.println(c1.check);
			System.out.println(c1.percentage);
			
		}
	}
	
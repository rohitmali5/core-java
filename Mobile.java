public class Mobile{


	public static void main(String[] args){
	
	String mobileName = "Redmi";
	String laptop = "ASUS";
	String institute = "X-works";
	String school = "KHPS";
	String socialMedia = "Instagram";
	String pgName = "HIGH Q PG";
	String area = "BTM Layout";
	String fanColor = "Black";
	String college = "HSIT Nidasoshi";
	String coldrink = "Pepsi";
	
	
	String bikeName = new String("Pulser");
	String doorColor = new String("White");
	String fruit = new String("Mango");
	String flower = new String("Rose");
	String shoeBrand = new String("Puma");
	String busStop = new String("Mico Layout");
	String country = new String("India");
	String quote = new String("hardwork wins when talent doesn't work hard");
	String cricketPlayer = new String("Virat  Kohali");
	String fevoriteTeam = new String("Royal Challengers Benglore");
	
	String upperCase = socialMedia.toUpperCase();
	System.out.println(upperCase);
	
	char[] charToArray = college.toCharArray();
	System.out.println(charToArray);
	
	String subString = busStop.substring(4);
	System.out.println(subString);
	
	String changedValue = busStop.replace("Mico","HSR");
	System.out.println(changedValue);
	
	boolean startsWith = cricketPlayer.startsWith("K");
	System.out.println(startsWith);
	
	
	
	
	
	}
}
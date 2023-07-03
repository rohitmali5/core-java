public class Robot{
	int price;
	static String brand;
	int capacity;
	static String shape;
	int size;
	static String color;
	int batteryBackup;
	float version;
	float chargingCapacity;
	float weight;
	float height;
	int cameraPixel;
	int numberOfSensors;
	int motorCapacity;
	int displaySize;//15
	boolean isWorkOnAi;
	boolean isTalking;
	static String processor;
	int ram;
	
	public Robot(int price,int capacity,float weight,float version,int ram){
		this.price = price;
		this.capacity = capacity;
		this.weight = weight;
		this.version = version;
		this.ram = ram;
		
	}
	
	public static void industrialWork(){
		
	}
	public static void worksInDanger(){
		
	}
	public static void surgery(){
		
	}
	public static void diliverOrders(){
		
	}
	public static void foodPreparation(){
		
	}
	public static void agriculturalWork(){
		
	}
	public static void militaryWork(){
		
	}
	public static void weatherForcasting(){
		
	}
	public static void spaceStudy(){
		
	}
	public static void mechanicalWork(){
		
	}
	public static void main(String[] args){
		Robot robot = new Robot(9644564,461,50.5f,8.2f,16);
		System.out.println(robot.price);
		System.out.println(robot.capacity);
		System.out.println(robot.weight);
		System.out.println(robot.version);
		System.out.println(robot.ram);
	}

}
public class Redmi{
	String model;
	String mobileType;
	String processor;
	int price;
	int noOfSpeakers;
	color col = color.BLUE;
	sound sound1 = sound.TWO;
	
	public Redmi(String model,String mobileType,String processor,int price,int noOfSpeakers
	){
		this.model = model;
		this.mobileType = mobileType;
		this.processor = processor;
		this.price = price;
		this.noOfSpeakers = noOfSpeakers;
	}
	
	
	public static void main(String[] args){
		
		Redmi ref = new Redmi("Note 7 Pro","5G","Snapdragan",35000,2);
		System.out.println(ref.model);
		System.out.println(ref.mobileType);
		System.out.println(ref.processor);
		System.out.println(ref.price);
		System.out.println(ref.noOfSpeakers);
		
		System.out.println(ref.col.getValue());
		System.out.println(ref.sound1.getValue());
	
	}
		
		public String getModel(){
		return this.model;
		}
		
		public String getMobileType(){
		return this.mobileType ;
		}
		public String getProcessor(){
		return this.processor;
		}
		
		public int getPrice(){
		return this.price;
		}
		public int getNoOfSpeakers(){
		return this.noOfSpeakers;
		}

}
enum color{
	BLACK("Black"),BLUE("Blue"),RED("Red");
	String value;
	
	
	color(String value){
	this.value = value;
	}
	
	public String getValue(){
	return this.value;
	}	
}

enum sound{
	ONE(1),TWO(2),THREE(3),FOUR(4);
	int value;
	
	sound(int value){
	this.value = value;
	}
	public int getValue(){
		return this.value;
	}
}
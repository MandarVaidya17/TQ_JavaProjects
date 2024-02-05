package com.abstractdemo;

abstract class Bike{
	
	//instance variable
	private int id;
	private String name;
	private double coast;
	
	//static variable
	static String brandName;
	static float discount;
	
	static {
		brandName="Honda";
	}
	
	//constuctor: to initilized instance variable
	//using super int child class
	
	Bike(){
		
	}

	public Bike(int id, String name, double coast) {
		super();
		this.id = id;
		this.name = name;
		this.coast = coast;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCoast() {
		return coast;
	}

	public void setCoast(double coast) {
		this.coast = coast;
	}

	public static String getBrandName() {
		return brandName;
	}

	public static void setBrandName(String brandName) {
		Bike.brandName = brandName;
	}
	//abstract and final cannot be together
	//abstract and static cannot be together

	abstract void description();
	
	public static float getDiscount() {
		return discount;
	}
	public static void setDiscount(float discount) {
		Bike.discount=discount;
	}
	
	final void display() {
		System.out.println("Brand name:"+brandName);
		System.out.println("Discount on all bikes:"+Bike.discount+"%");
		System.out.println("----------------------------------------");
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("Cost:"+coast);
		System.out.println("discount:"+(coast-((discount/100)*coast)));
	}
}

class BasicBike extends Bike{
		private float avg;
		public BasicBike() {
			
		}
		
	public BasicBike(float avg,int id, String name, double coast) {
			super(id, name, coast);
			this.avg = avg;
		}
	@Override
	void description() {
		System.out.println("this is normal bike");
		System.out.println("number of gears :4");
		System.out.println("Avarage"+avg);
		
	}
}

class SportBike extends Bike{
	private int gears;
	private float speed;
	public SportBike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SportBike(int gears, float speed,int id, String name, double coast) {
		super(id, name, coast);
		this.gears = gears;
		this.speed = speed;
	}
	@Override
	void description() {
		System.out.println("this is sport bike");
		System.out.println("gear:"+gears);
		System.out.println("speed:"+speed);
	}
	
	
	
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Bike b;
			Bike.setDiscount(20);
			b=new SportBike(6,300,101,"Ducaati",100000);
			b.display();
			b.description();
			
			System.out.println("---------------------");
			b=new BasicBike(50,999,"Platina",80000);
			b.display();
			b.description();
	}

}

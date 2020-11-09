package opps.ClassObjectInheritance;


class OneBHK{
	protected double roomArea;
	protected double hallArea;
	protected double price;
	
	public OneBHK() {
		roomArea=300;
		hallArea=450;
		price=900000;
	}
	
	public OneBHK(double roomArea, double hallArea, double price) {
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}
	
	public void show()
	{
		System.out.println("Room Area :"+roomArea);
		System.out.println("Hall Area :"+hallArea);
		System.out.println("Price :"+price+"/-");
		
	}
}


class TwoBHK extends OneBHK{
	private double room2Area;
	
	public TwoBHK() {
		roomArea=300;
		hallArea=450;
		room2Area=400;
		price=1300000;
	}
	
	public TwoBHK(double roomArea, double hallArea, double room2Area ,double price) {
		super(roomArea, hallArea, price);
		this.room2Area=room2Area;
	}
	
	public void show()
	{
		super.show();
		System.out.println("Room2 Area :"+room2Area);
		
	}
}


public class DemoD {

	public static void main(String[] args) {
		TwoBHK[] tarr =new TwoBHK[3];
		tarr[0]= new TwoBHK(300,500,300,2360000);
		tarr[1]= new TwoBHK(350,550,300,3500000);
		tarr[2]= new TwoBHK(200,300,300,2030000);
		
		double total_price=0;
		for (int i = 0; i < tarr.length; i++) {
			tarr[i].show();
			total_price = total_price + tarr[i].price;
			System.out.println();
		}
		
		System.out.println("Total amount of all flats is: "+total_price+"/-");
		
		
	}

}

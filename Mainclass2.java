abstract class watch
{
  String brand;
  double price;
  String type;
  String model;
}
public watch( String brand,double price,String type,String model)
{
	this.brand=brand;
	this.price=price;
	this.type=type;
	this.model=model;
}

abstract public void time();
public void display()
{
	System.out.println("brand is"+brand);
	System.out.println("price is"+price);
	System.out.println("type is"+type);
	System.out.println("model is"+model);
}
}
class smartwatch extends watch
{
	public smartwatch(String brand,double price,String type,String model)
{
		super(brand,price,type,model);
}
		public void time()
	{
			System.out.println("time is 8:00pm");
	}
	public void displayheartrate()
	{
	System.out.println("heart rate is 75");
	}
	public void displaysteps()
	{
		System.out.println("1000 steps");
	}
}

class analog watch extends watch
{
	public analog watch(String brand,double price,String type,String model)
{
		super(brand,price,type,model);
}
public void time()
	{
			System.out.println("time is 8:00pm");
	}
	public void displayheartrate()
	{
	System.out.println("heart rate is 75");
	}
	public void displaysteps()
	{
		System.out.println("1000 steps");
	}
}
class  Mainclass2
{
	public static void main(String[] args) 
	{
		watch w;
		smartwatch s1=new smartwatch("apple",5545454,"digital","e23");
		w=s1;
		w.display();
        smartwatch s2=new smartwatch("samsung",1000004,"smart","s45");
		w=s2;
		w.display();
        analog watch a1=new analog watch("abc",5545,"analog","a34");
		w=a1;
		w.display();
        analog watch a2=new analog watch("def",10000,"gsl","g45");
		w=a2;
		w.display();
		
	}
}

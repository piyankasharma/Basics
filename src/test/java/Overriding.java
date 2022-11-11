class Vehicle{
	void run(){
		System.out.println("vehicle is running");
	}
}
class Car extends Vehicle{
	void run(){
		System.out.println("car is running");
		//super.run();
	}
}
public class Overriding {

	public static void main(String[] args) {
		
      Car obj=new Car();
      obj.run();
	}

}

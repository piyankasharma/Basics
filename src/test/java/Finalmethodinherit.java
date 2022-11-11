class Bike{
	final void run(){
		System.out.println("bike is running");
	}
}
class Hero extends Bike{
	void running(){
		super.run();
	}
}
public class Finalmethodinherit {

	public static void main(String[] args) {
		Hero obj=new Hero();
		obj.running();

	}

}

class Extra{
	static int add(int a,int b){
		return a+b;
		
	}
	static int add(int a,int b,int c){
		return a+b+c;
		
	}
	
}
public class Overloading {

	public static void main(String[] args) {
	System.out.println(Extra.add(10,23));
 System.out.println(Extra.add(10, 23, 15));
	}
	

}

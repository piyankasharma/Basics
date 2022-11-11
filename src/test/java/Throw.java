
public class Throw {
  public static void validate(int age){
	  if(age<18){
		  throw new ArithmeticException("person is not eligible for vote");
	  }
	  else{
		  System.out.println("eligible");
	  }
  }
	public static void main(String[] args) {
		Throw.validate(21);
		System.out.println("rest");
	}
	

}

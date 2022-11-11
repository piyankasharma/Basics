
public class Finallyblock {

	public static void main(String[] args) {
		try{
			int data=100/0;
	
		}
		catch(Exception e){
			
		}
		finally{
			System.out.println("finally block is executed");
		}
		System.out.println("rest code");
		
	}

}

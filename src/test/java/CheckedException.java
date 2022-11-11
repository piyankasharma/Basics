import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {

	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw=new PrintWriter("jtp.txt");
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("rest code");

	}

}

class Student{
	int roll;
	String name;
	static String college="APC";
	static void change(){
		college="BP Podder";
	}
	Student(int r,String n){
		roll=r;
		name=n;
		
	}
	void show(){
		System.out.println(roll+" "+name+" "+college);
	}
}
public class Statickeywords {

	public static void main(String[] args) {
	Student.change();
		
		Student obj=new Student (1,"Piyanka");
	obj.show();
	}

}

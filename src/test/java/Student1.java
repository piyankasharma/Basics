
public class Student1 {
	int id;
	String name;
	int age;
	
	Student1(int i,String n ){
		id=i;
		name=n;
		
	}
	Student1(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void show(){
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String[] args) {
		Student1 obj=new Student1(25,"Piyanka");
		Student1 obj2=new Student1(26,"Dweep",30);
		obj.show();
		obj2.show();
//constructor can be overloaded.
	}

}

class Account{
	private long accountno;
	private String name,email;
	private float amount;
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}
public class Testincapsulation {

	public static void main(String[] args) {
		Account obj=new Account();
		obj.setAccountno(2385429642L);
        obj.setEmail("sharmapiyanka5@gmail.com");
        obj.setName("Piyanka Sharma");
        obj.setAmount(50000f);
        System.out.println(obj.getAccountno()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
	}

}

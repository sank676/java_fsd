// employee gets goldcoin -subclass employee 


package ustbatchno3.junit5testcases;

import java.util.Date;

 public class Employee {
	private String name;
	private Date joiningdate;
	private int goldcoins; 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoiningdate() {
		return joiningdate;
	}
	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}
	public int getGoldcoins() {
		return goldcoins;
	}
	public void setGoldcoins(int goldcoins) {
		this.goldcoins = goldcoins;
	}
	public Employee(String name, Date joiningdate, int goldcoins) {
		super();
		this.name = name;
		this.joiningdate = joiningdate;
		this.goldcoins = goldcoins;
	}
	public Employee(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

}

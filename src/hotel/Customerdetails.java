package hotel;

public class Customerdetails {
	private String cid;
	private String name;
	private int mobno;
	private String emailid;
	private String loc;
	public Customerdetails(String cid, String name, int mobno, String emailid, String loc) {
		
		this.cid = cid;
		this.name = name;
		this.mobno = mobno;
		this.emailid = emailid;
		this.loc = loc;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobno() {
		return mobno;
	}
	public void setMobno(int mobno) {
		this.mobno = mobno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	@Override
	public String toString() {
		return "Customerdetails [cid=" + cid + ", name=" + name + ", mobno=" + mobno + ", emailid=" + emailid + ", loc="
				+ loc + "]";
	}
}
	
	
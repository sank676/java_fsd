package hotelsa;

public class Hotel {
	String hotelname;
	int budget;
	public Hotel(String hotelname, int budget) {
		super();
		this.hotelname = hotelname;
		this.budget = budget;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}

}

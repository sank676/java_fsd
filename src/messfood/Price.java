package messfood;

public class Price {
	private String food;
	private int price;
	private int choice;
	
	public Price(String food, int price, int choice) {
		super();
		this.food = food;
		this.price = price;
		this.choice = choice;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	
}
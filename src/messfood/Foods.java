package messfood;

public class Foods {
	private int id;
	private String name;
	private String food;
	private String price;
	public Foods(int id, String name, String food, String price) {
		super();
		this.id = id;
		this.name = name;
		this.food = food;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Foods [id=" + id + ", name=" + name + ", food=" + food + ", price=" + price + "]";
	}
	
}
	
	
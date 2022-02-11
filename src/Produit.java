
public class Produit {
	private String name;
	private int number;
	private int price;
	
	public Produit (String Name, int Number, int Price) {
		this.name = Name;
		this.number = Number;
		this.price = Price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int Number) {
		this.number = Number;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int Price) {
		this.price = Price;
	}
	
	
	
}

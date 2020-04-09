package solidprinciples.interfaceseggergation.good;

public class HouseToy implements Toy{

	private String color;
	private double price;
	
	public HouseToy() {}
	
	public HouseToy(String color, double price) {
		super();
		this.color = color;
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
		
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
		
	}

	public double getPrice() {
		return price;
	}

}

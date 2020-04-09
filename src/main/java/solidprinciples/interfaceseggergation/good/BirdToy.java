package solidprinciples.interfaceseggergation.good;

public class BirdToy implements Toy, Flyable{
	private String color;
	private double price;
	
	public BirdToy() {}
	
	public BirdToy(String color, double price) {
		this.color = color;
		this.price = price;
	}
	
	public void fly() {
		System.out.println("Bird is flying");
		
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

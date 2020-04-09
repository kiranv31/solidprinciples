package solidprinciples.interfaceseggergation.bad;

public class ToyHouse implements Toy{

	private String color;
	private double price;
	
	public void setColor(String color) {
		this.setColor(color);
	}

	public void setPrice(double price) {
		this.setPrice(price);
	}

	// house can not be moved
	public void move() {
	}

	// house can not fly
	public void fly() {
	}

}

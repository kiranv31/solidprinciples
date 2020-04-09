package solidprinciples.interfaceseggergation.bad;

public class ToyShip implements Toy{

	private String color;
	private double price;
	
	public void setColor(String color) {
		this.setColor(color);
	}

	public void setPrice(double price) {
		this.setPrice(price);
	}

	public void move() {
		System.out.println("Ship is moving");
		
	}

	// not needed
	public void fly() {		
	}

}

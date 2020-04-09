package solidprinciples.interfaceseggergation.good;

public class ToyTrain implements Toy, Movable {

	private String color;
	private double price;

	public ToyTrain() {}

	public ToyTrain(String color, double price) {
		this.color = color;
		this.price = price;
	}

	public void move() {
		System.out.println("train is moving");
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

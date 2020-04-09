package solidprinciples.interfaceseggergation.good;

public class ToyFactory {
	public static Toy createBirdToy(String color, double price) {
		return new BirdToy(color, price);
	}
	
	public static Toy createTrainToy(String color, double price) {
		return new BirdToy(color, price);
	}
	
	public static Toy createHouseToy(String color, double price) {
		return new BirdToy(color, price);
	}
}

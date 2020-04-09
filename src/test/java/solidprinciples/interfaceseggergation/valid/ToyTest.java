package solidprinciples.interfaceseggergation.valid;

import static org.junit.Assert.*;

import org.junit.Test;

import solidprinciples.interfaceseggergation.good.Toy;
import solidprinciples.interfaceseggergation.good.ToyFactory;

public class ToyTest {
	
	private Toy toy;

	@Test
	public void test() {
		toy = ToyFactory.createBirdToy("red", 1000);
		System.out.println(toy);
		
		toy = ToyFactory.createHouseToy("green", 250);
		System.out.println(toy);
	}

}

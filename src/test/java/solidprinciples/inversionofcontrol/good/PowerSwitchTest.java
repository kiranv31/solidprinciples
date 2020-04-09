package solidprinciples.inversionofcontrol.good;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PowerSwitchTest {

	private PowerSwitch powerSwitch;
	private Switchable client;

	@Test
	public void testFanSwitch() {

		client = new Fan();
		powerSwitch = new PowerSwitch(client);

		powerSwitch.press();

		assertTrue(true && powerSwitch.isOn());

		powerSwitch.press();
		assertFalse(true && powerSwitch.isOn());

	}

	@Test
	public void testBulbSwitch() {

		client = new Bulb();
		powerSwitch = new PowerSwitch(client);

		powerSwitch.press();

		assertTrue(true && powerSwitch.isOn());

		powerSwitch.press();
		assertFalse(true && powerSwitch.isOn());

	}
}

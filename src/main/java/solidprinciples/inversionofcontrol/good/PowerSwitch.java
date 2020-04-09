package solidprinciples.inversionofcontrol.good;

public class PowerSwitch implements Switch{
	
	private boolean on;
	
	private Switchable client;
	
	public PowerSwitch() {}
	
	public PowerSwitch(Switchable client) {
		this.client = client;
		on = false;
	}

	public boolean isOn() {
		return on;
	}

	public void press() {
		if(on) {
			client.turnOff();
			on = false;
		}else {
			client.turnOn();
			on = true;
		}
		
	}

}

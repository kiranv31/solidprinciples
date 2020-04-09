package solidprinciples.inversionofcontrol.good;

public class Bulb implements Switchable{
	boolean on;
	
	public Bulb(){
		this.on = false;
	}
	
	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

}

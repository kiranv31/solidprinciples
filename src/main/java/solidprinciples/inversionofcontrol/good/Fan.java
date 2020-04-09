package solidprinciples.inversionofcontrol.good;

public class Fan implements Switchable {

	boolean on;

	public Fan(){
		this.on = false;
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}
}

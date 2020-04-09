package solidprinciples.inversionofcontrol.bad;

public class Bulb {
	boolean on;
	
	void setOn() {
		on = true;
	}
	
	void setOff() {
		on = false;
	}
}

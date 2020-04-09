package solidprinciples.inversionofcontrol.bad;

public class PowerSwitch {
	private Bulb bulb;
	private boolean on;
	
	public PowerSwitch() {}
	
	public PowerSwitch(Bulb bulb) {
		this.bulb = bulb;
		this.on = false;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void switchPress() {
		if(on) {
			bulb.setOff();
			on = false;
		}else {
			bulb.setOn();
			on = true;
		}
	}
}

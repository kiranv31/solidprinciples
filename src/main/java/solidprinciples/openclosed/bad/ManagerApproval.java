package solidprinciples.openclosed.bad;

public class ManagerApproval {
	private CarInsuranceSurveyor carSurveyor;
	private HealthInsuranceSurveyor healthSurveyor;
	
	
	public ManagerApproval(CarInsuranceSurveyor carSurveyor, HealthInsuranceSurveyor healthSurveyor) {
		this.carSurveyor = carSurveyor;
		this.healthSurveyor = healthSurveyor;
	}
	
	public String getApprovalForCar(String status) {
		return carSurveyor.isValidClaim(status)? "approved": "not approved";
	}
	
	public String getApprovalForHealth(String status) {
		return healthSurveyor.isValidClaim(status)? "approved": "not approved";
	}
	
}

package solidprinciples.openclosed.good;

public class ManagerApproval {
	private InsuranceSurveyor surveyor;
	
	public ManagerApproval(InsuranceSurveyor surveyor) {
		this.surveyor = surveyor;
	}
	
	public String getApproval(String status) {
		return surveyor.isValidClaim(status)? "approved": "not approved";
	}
	
}

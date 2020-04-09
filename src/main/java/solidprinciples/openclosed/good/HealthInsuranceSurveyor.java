package solidprinciples.openclosed.good;

public class HealthInsuranceSurveyor implements InsuranceSurveyor{

	public boolean isValidClaim(String status) {
		return status.equals("valid");
	}

}

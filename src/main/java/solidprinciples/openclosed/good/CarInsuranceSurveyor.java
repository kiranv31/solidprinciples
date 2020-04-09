package solidprinciples.openclosed.good;

public class CarInsuranceSurveyor implements InsuranceSurveyor{

	public boolean isValidClaim(String status) {
		return status.equals("valid");
	}

}

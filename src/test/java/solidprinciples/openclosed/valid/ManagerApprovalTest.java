package solidprinciples.openclosed.valid;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import solidprinciples.openclosed.good.HealthInsuranceSurveyor;
import solidprinciples.openclosed.good.ManagerApproval;

public class ManagerApprovalTest {

	private ManagerApproval approval;
	
	@Before
	public void beforeTest() {
		approval = new ManagerApproval(new HealthInsuranceSurveyor());
	}
	
	
	@Test
	public void test() {
		assertEquals("approved", approval.getApproval("valid"));
	}

}

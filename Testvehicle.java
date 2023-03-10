package ustbatchno3.junit5testcases;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testvehicle {

  @Test
  public void testGetStateFromRegistrationNumber() {
    Vehicle vr = new Vehicle();
    String state = vr.getStateFromRegistrationNumber("KA01AB1234");
    assertEquals("Karnataka", state);
  }

  @Test
  public void testGetDistrictFromRegistrationNumber() {
    Vehicle vr = new Vehicle();
    String district = vr.getDistrictFromRegistrationNumber("KA01AB1234");
    assertEquals("Bangalore Urban", district);
  }
}
		
		
	

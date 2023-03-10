package ustbatchno3.junit5testcases;

import java.util.HashMap;

public class Vehicle {

  private HashMap<String, String> states = new HashMap<String, String>();
  private HashMap<String, String> districts = new HashMap<String, String>();

  public void VehicleRegistrationNumber() {
    // Add state codes and names to the state lookup table
    states.put("AP", "Andhra Pradesh");
    states.put("AR", "Arunachal Pradesh");
    states.put("AS", "Assam");
    // Add more state codes and names here...

    // Add district codes and names to the district lookup table
    districts.put("01", "Adilabad");
    districts.put("02", "Anantapur");
    districts.put("03", "Chittoor");
    // Add more district codes and names here...
  }

  public String getStateFromRegistrationNumber(String registrationNumber) {
    String stateCode = registrationNumber.substring(0, 2);
    return states.get(stateCode);
  }

  public String getDistrictFromRegistrationNumber(String registrationNumber) {
    String districtCode = registrationNumber.substring(2, 4);
    return districts.get(districtCode);
  }
}

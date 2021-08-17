package vehicles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.*;

public class FordKa {
  public List<VehicularFeatures> AvailableFordKaFeatures = new ArrayList<VehicularFeatures>();

  public List<VehicularFeatures> getAvailableFordKaFeatures() {
    return AvailableFordKaFeatures;
  }

  public void setAvailableFordKaFeatures(
    List<VehicularFeatures> availableFordKaFeatures
  ) {
    AvailableFordKaFeatures = availableFordKaFeatures;
  }

  public FordKa() {
    setAvailableFordKaFeatures(
        Arrays.asList(
          VehicularFeatures.BLUETOOTH,
          VehicularFeatures.NAVIGATION_SYSTEM,
          VehicularFeatures.BACKUP_CAMERA
        )
      );
  }

  public void BLUETOOTH() {
    System.out.println("Operating Bluetooth by using Ford Ka components");
  }

  public void NAVIGATION_SYSTEM() {
    System.out.println("Operating Navigation System by using Ford Ka components");
  }

  public void BACKUP_CAMERA() {
    System.out.println("Operating Backup Camera by using Ford Ka components");
  }
}

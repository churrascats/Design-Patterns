package vehicles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import models.*;

public class MachE {
  public List<VehicularFeatures> availableMachEFeatures = new ArrayList<VehicularFeatures>();

  public MachE() {
    setAvailableMachEFeatures(
      Arrays.asList(
        VehicularFeatures.BLUETOOTH,
        VehicularFeatures.NAVIGATION_SYSTEM,
        VehicularFeatures.BACKUP_CAMERA,
        VehicularFeatures.ANDROID_AUTO,
        VehicularFeatures.APPLE_CARPLAY,
        VehicularFeatures.BLIND_SPOT_MONITORING,
        VehicularFeatures.HEATED_SEATS,
        VehicularFeatures.MOONROOF,
        VehicularFeatures.REMOTE_START,
        VehicularFeatures.SUNROOF,
        VehicularFeatures.THIRD_ROW_SEAT
      )
    );
  }

  public List<VehicularFeatures> getAvailableMachEFeatures() {
    return availableMachEFeatures;
  }

  public void setAvailableMachEFeatures(
    List<VehicularFeatures> availableMachEFeatures
  ) {
    this.availableMachEFeatures = availableMachEFeatures;
  }

  public void BLUETOOTH() {
    System.out.println("Operating Bluetooth by using Mach E components");
  }

  public void NAVIGATION_SYSTEM() {
    System.out.println(
      "Operating Navigation System by using Mach E components"
    );
  }

  public void BACKUP_CAMERA() {
    System.out.println("Operating Backup Camera by using Mach E components");
  }

  public void ANDROID_AUTO() {
    System.out.println("Operating Android Auto by using Mach E components");
  }

  public void APPLE_CARPLAY() {
    System.out.println("Operating Apple Car Play by using Mach E components");
  }

  public void BLIND_SPOT_MONITORING() {
    System.out.println(
      "Operating Blind Spot Monitoring by using Mach E components"
    );
  }

  public void HEATED_SEATS() {
    System.out.println("Operating Heated Seats by using Mach E components");
  }

  public void MOONROOF() {
    System.out.println("Operating Moon Roof by using Mach E components");
  }

  public void REMOTE_START() {
    System.out.println("Operating Remote Start by using Mach E components");
  }

  public void SUNROOF() {
    System.out.println("Operating Sun Roof by using Mach E components");
  }

  public void THIRD_ROW_SEAT() {
    System.out.println("Operating Third Row Seat by using Mach E components");
  }
}

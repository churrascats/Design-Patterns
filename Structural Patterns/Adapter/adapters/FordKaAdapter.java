package adapters;

import vehicles.FordKa;
import vehicles.MachE;

public class FordKaAdapter extends MachE {
  private FordKa fordKa;

  public FordKaAdapter(FordKa fordKa) {
    this.fordKa = fordKa;
  }

  @Override
  public void ANDROID_AUTO() {
      System.out.println("Feature Unavailable");
  }

  @Override
  public void APPLE_CARPLAY() {
      System.out.println("Feature Unavailable");
  }

  @Override
  public void BACKUP_CAMERA() {
      fordKa.BACKUP_CAMERA();
  }

  @Override
  public void BLIND_SPOT_MONITORING() {
      System.out.println("Feature Unavailable");
  }

  @Override
  public void BLUETOOTH() {
    fordKa.BLUETOOTH();
  }

  @Override
  public void HEATED_SEATS() {
      System.out.println("Feature Unavailable");
  }

  @Override
  public void MOONROOF() {
      System.out.println("Feature Unavailable");
  }

  @Override
  public void NAVIGATION_SYSTEM() {
    fordKa.NAVIGATION_SYSTEM();
  }

  @Override
  public void REMOTE_START() {
      System.out.println("Feature Unavailable");
  }

  @Override
  public void SUNROOF() {
      System.out.println("Feature Unavailable");
  }

  @Override
  public void THIRD_ROW_SEAT() {
      System.out.println("Feature Unavailable");
  }
}

package models;

public enum VehicularFeatures {
  BLUETOOTH("ZUAG2G64X9"),
  NAVIGATION_SYSTEM("R0WI0CMVBC"),
  SUNROOF("TGRDY8EGR1"),
  MOONROOF("TGRDY8EGR2"),
  HEATED_SEATS("VUDJQX4Y2"),
  BACKUP_CAMERA("W6064G0WS2"),
  APPLE_CARPLAY("L09L3MAO28"),
  ANDROID_AUTO("L09L3MAO29"),
  REMOTE_START("F76Y8X7PWW"),
  BLIND_SPOT_MONITORING("D7PLY6HMZC"),
  THIRD_ROW_SEAT("ZGIMAWBM0B");

  private String description;

  public String getDescription() {
    return description;
  }

  private VehicularFeatures(String description) {
    this.description = description;
  }
}

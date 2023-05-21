import adapters.FordKaAdapter;
import vehicles.*;

public class Main {

  public static void main(String[] args) {
    MachE machE = new MachE();
    FordKa fordKa = new FordKa();

    //Bluetooth
    //Navigation System
    //Apple Car Play

    machE.BLUETOOTH();
    machE.NAVIGATION_SYSTEM();
    machE.APPLE_CARPLAY();

    System.out.println("\n\n");

    //fordKa.BLUETOOTH();
    //fordKa.NAVIGATION_SYSTEM();
    //fordKa.APPLE_CARPLAY();

    FordKaAdapter fordKaAdapter = new FordKaAdapter(fordKa);

    fordKaAdapter.BLUETOOTH();
    fordKaAdapter.NAVIGATION_SYSTEM();
    fordKaAdapter.APPLE_CARPLAY();
  }
}

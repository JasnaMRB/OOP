package dip.clients;

import dip.processes.GeneralManufacturingProcess;
import dip.processes.SmartphoneManufacturingProcess;

public class ManufacturingFactory {
    public static void main(String[] args) {

    GeneralManufacturingProcess manufacturingProcess = new SmartphoneManufacturingProcess("IPhone");
        manufacturingProcess.launchProcess();
    }


}

package principles.dip.clients;

import principles.dip.processes.GeneralManufacturingProcess;
import principles.dip.processes.SmartphoneManufacturingProcess;

public class ManufacturingFactory {
    public static void main(String[] args) {

    GeneralManufacturingProcess manufacturingProcess = new SmartphoneManufacturingProcess("IPhone");
        manufacturingProcess.launchProcess();
    }


}

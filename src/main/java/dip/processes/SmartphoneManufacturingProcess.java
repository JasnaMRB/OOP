package dip.processes;

public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void doAssembling() {
        System.out.println("Assembling smartphone");
    }

    @Override
    protected void doTesting() {
        System.out.println("Testing smartphone");

    }

    @Override
    protected void doPackaging() {
        System.out.println("Packaging smartphone");

    }

    @Override
    protected void doStorage() {
        System.out.println("Storing smartphone");
    }
}

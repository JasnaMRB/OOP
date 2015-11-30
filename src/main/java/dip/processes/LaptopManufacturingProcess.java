package dip.processes;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void doAssembling() {
        System.out.println("Assembling laptop");
    }

    @Override
    protected void doTesting() {
        System.out.println("Testing laptop");

    }

    @Override
    protected void doPackaging() {
        System.out.println("Packaging laptop");

    }

    @Override
    protected void doStorage() {
        System.out.println("Storing laptop");
    }
}

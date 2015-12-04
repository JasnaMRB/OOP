package principles.dip.processes;

abstract public class GeneralManufacturingProcess {

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }
    private String processName;
    public void launchProcess() {
        if (processName != null && !processName.isEmpty()){
            doAssembling();
            doTesting();
            doPackaging();
            doStorage();
        } else System.out.println("No process name was specified.");
    }
    protected abstract void doAssembling();
    protected abstract void doTesting();
    protected abstract void doPackaging();
    protected abstract void doStorage();
}

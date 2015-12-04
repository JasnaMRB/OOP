package designpatterns.singleton;

public class PerformanceStage {
    private static PerformanceStage INSTANCE = null;
    private static int counter;
    private PerformanceStage() {
        counter++;
    }

    public void turnOnLights() {
        System.out.println("Turned on lights...");
    }

    public static synchronized PerformanceStage getInstance() {
        // if and only if instance is null (first time), then create a new object
        if (INSTANCE == null) {
            INSTANCE = new PerformanceStage();
        }

        return INSTANCE;
    }

    public int getCounter() {
        return counter;
    }
}

package designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        PerformanceStage stage = PerformanceStage.getInstance();
        stage.turnOnLights();
        System.out.println(stage.getCounter());
        System.out.println(stage.getCounter());
        PerformanceStage stage2 = PerformanceStage.getInstance();
        stage2.turnOnLights();
        System.out.println(stage2.getCounter());
        System.out.println(stage2.getCounter());
    }
}

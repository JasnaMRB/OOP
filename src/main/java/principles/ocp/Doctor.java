package principles.ocp;


public class Doctor extends Employee {
    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action...");
    }

    @Override
    public void performDuties() {
        prescribeMedicine();
        diagonosePatients();
    }

    private void prescribeMedicine() {
        System.out.println("Prescribing medicine");

    }

    private void diagonosePatients() {
        System.out.println("Diagnosing patient");
    }
}

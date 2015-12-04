package principles.ocp;

/**
 * Responsible for knowing behaviors of employees
 */
public class HospitalManagement {

    public void callUpon(Employee employee) {
        employee.performDuties();
    }


}

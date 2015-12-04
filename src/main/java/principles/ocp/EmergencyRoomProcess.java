package principles.ocp;

/**
 *  HospitalManagement goes into Emergency Room and tells Employee(s) to do stuff
 */
public class EmergencyRoomProcess {
    public static void main(String[] args) {
        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse (1, "Peggy", "emergency", true);
        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "emergency", true);
        ERDirector.callUpon(suzan);
    }
}

import java.util.ArrayList;
import java.util.HashSet;

public class Q12HospitalPatientList {
    public static void main(String[] args) {

        ArrayList<String> patients = new ArrayList<>();

        HashSet<String> ids = new HashSet<>();

        patients.add("Rahul");
        patients.add("Priya");
        patients.add("Amit");

        ids.add("P101");
        ids.add("P102");
        ids.add("P103");

        System.out.println("Patient Names: " + patients);
        System.out.println("Patient IDs: " + ids);

        patients.remove("Priya");
        ids.remove("P102");

        System.out.println("After Removal:");
        System.out.println("Patient Names: " + patients);
        System.out.println("Patient IDs: " + ids);

        if (patients.contains("Rahul")) {
            System.out.println("Patient Rahul found.");
        } else {
            System.out.println("Patient not found.");
        }

        System.out.println("Total Patients: " + patients.size());
    }
}

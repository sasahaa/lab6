import java.util.ArrayList;
import java.util.ListIterator;

public class Doctor implements Comparable<Doctor> {
    @Override
    public int compareTo(Doctor o) {
        return this.fullName.compareTo(o.fullName);
    }

    @Override
    public String toString() {
        return fullName + " - " + specialization;
    }

    private String fullName;
    private String specialization;
    private String phoneNumber;
    private String email;

    public Doctor(String fullName, String specialization, String phoneNumber, String email){
        this.fullName = fullName;
        this.specialization = specialization;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void treatPatient(Patient patient) {
        System.out.println("Doctor " + fullName + " treats " + patient.getName());
    }
    @Override
    public int hashCode(){
        return fullName.hashCode();
    }
    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(!(object instanceof  Doctor)) return false;
        Doctor doctor = (Doctor) object;
        return fullName.equals(doctor.fullName);
    }
}

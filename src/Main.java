import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("B", "Pediatrician", "097777777", "b@gmail.com"));
        doctors.add(new Doctor("A", "Surgeon", "0988888888", "a@gmail.com"));
        doctors.add(new Doctor("C", "Neurologist", "096666666", "c@gmail.com"));
        doctors.add(new Doctor("A", "Surgeon", "0988888888", "a@gmail.com"));
        doctors.add(new Doctor("Z", "Neurologist", "000000000", "z@gmail.com"));
        doctors.add(new Doctor("M", "Pediatrician", "091111111", "m@gmail.com"));
        doctors.add(new Doctor("X", "Pediatrician", "091222222", "x@gmail.com"));

        System.out.println("ArrayList: ");
        for(Doctor doctor : doctors){
            System.out.println(doctor);
        }

        HashSet<Doctor> set = new HashSet<>(doctors);

        System.out.println("HashSet: ");
        for(Doctor doctor : set){
            System.out.println(doctor);
        }

        Collections.sort(doctors);

        System.out.println("Sorted:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }

        TreeSet<Doctor> treeSet = new TreeSet<>(doctors);

        System.out.println("TreeSet:");
        for (Doctor doctor : treeSet) {
            System.out.println(doctor);
        }

        TreeMap<String, Doctor> map = new TreeMap<>();

        for (Doctor doctor : doctors) {
            map.put(doctor.toString(), doctor);
        }

        System.out.println("TreeMap:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        LinkedList<Doctor> list = new LinkedList<>(doctors);

        list.addFirst(new Doctor("D", "d", "095555555", "b@gmail.com"));

        System.out.println("LinkedList:");
        for (Doctor doctor : list) {
            System.out.println(doctor);
        }

        Queue<Doctor> queue = new LinkedList<>(doctors);

        System.out.println("Queue:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

        PriorityQueue<Doctor> pq = new PriorityQueue<>(doctors);

        System.out.println("PriorityQueue:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

        Hospital hospital1 = new Hospital("City Hospital", "Shevchenko St.");
        hospital1.showHospital();

        //inner class
        Hospital.Administrator admin1 = hospital1.new Administrator("Anna Sasaha", "0988868686", "as@gmail.com");
        admin1.manageHospital();

        //static nested class
        Hospital.Department department1 = new Hospital.Department("Surgery", 3);
        department1.showDepartment();

        //association
        Doctor doctor1 = new Doctor("A A", "Cardiologist", "0988868686", "aa@gmail.com");
        Patient patient1 = new Patient("B B", "female", "0988818888", "Shevchenko St.", " bb@gmail.com");

        doctor1.treatPatient(patient1);

        //local class
        class Reception{
            void createReception() {
                System.out.println("Reception created for patient.");
            }
        }

        Reception reception1 = new Reception();
        reception1.createReception();


    }
}

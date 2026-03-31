public class Hospital {
    private String name;
    private String address;

    public Hospital(String name, String adress){
        this.name = name;
        this.address = adress;
    }

    public void showHospital() {
        System.out.println("Hospital: " + name);
        System.out.println("Address: " + address);
    }

    // static nested class(вкладений клас)
    static class Department{
        private String name;
        private int floor;

        public Department(String name, int floor){
            this.name = name;
            this.floor = floor;
        }

        void showDepartment() {
            System.out.println("Department: " + name + ", Floor: " + floor);
        }
    }

    //inner class(внутрішній клас)
    class Administrator{
        private String fullName;
        private String phoneNumber;
        private String email;

        Administrator(String name, String phoneNumber, String email){
            this.fullName = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        void manageHospital() {
            System.out.println(fullName + " manages the hospital.");
        }
    }
}

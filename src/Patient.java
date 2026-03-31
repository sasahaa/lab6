public class Patient {
    private String name;
    private String sex;
    private String phoneNumber;
    private String address;
    private String email;

    public  Patient(String name, String sex, String phoneNumber, String address, String email) {
        this.name = name;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;

    }
    public String getName() {
        return name;
    }
}


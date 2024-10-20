package Lab2;

class IndividualOwner extends Owner {
    private String passportNumber;
    private String address;

    public IndividualOwner(String name, String surname, Date birthdate, String passportNumber, String address) {
        super(name, surname, birthdate);
        this.passportNumber = passportNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + ", Passport Number: " + passportNumber + ", Address: " + address;
    }
}

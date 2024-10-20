package Lab2;

class OrganizationOwner extends Owner {
    private String organizationName;
    private String contactPerson;

    public OrganizationOwner(String name, String surname, Date birthdate, String organizationName, String contactPerson) {
        super(name, surname, birthdate);
        this.organizationName = organizationName;
        this.contactPerson = contactPerson;
    }

    @Override
    public String toString() {
        return super.toString() + ", Organization Name: " + organizationName + ", Contact Person: " + contactPerson;
    }
}

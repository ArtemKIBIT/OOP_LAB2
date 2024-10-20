package Lab2;

class Owner {
    private String name;
    private String surname;
    private Date birthdate;

    public Owner(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    @Override
    public String toString() {
        return "Owner: " + name + " " + surname + ", Birthdate: " + birthdate;
    }
}
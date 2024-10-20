package Lab2;

public class Main {
    public static void main(String[] args) {

        Date birthdate1 = new Date(15, 5, 1985);
        Date birthdate2 = new Date(20, 10, 1990);
        Date birthdate3 = new Date(1, 1, 2000);


        Owner owner1 = new Owner("John", "Doe", birthdate1);
        IndividualOwner owner2 = new IndividualOwner("Jane", "Smith", birthdate2, "AB123456", "123 Main St");
        OrganizationOwner owner3 = new OrganizationOwner("Shelter", "Johnson", birthdate3, "Animal Rescue Org", "Emily White");


        Animal animal1 = new Animal("Max", AnimalType.DOG, owner1);
        Animal animal2 = new Animal("Luna", AnimalType.CAT, owner2);
        Animal animal3 = new Animal("Charlie", AnimalType.BIRD, owner3);


        animal1.addVisit(new Visit("Vaccination", 50.0, new Date(20, 9, 2024)));
        animal2.addVisit(new Visit("Check-up", 30.0, new Date(25, 9, 2024)));
        animal3.addVisit(new Visit("Neutering", 100.0, new Date(15, 9, 2024)));


        System.out.println("Інформація про тварин");
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);


        System.out.println("Порівняння Тварин");
        System.out.println("animal1 и animal2 "  + animal1.equals(animal2));
        System.out.println("animal1 и animal3 "  + animal1.equals(animal3));
        System.out.println("animal2 и animal3 "  + animal2.equals(animal3));
    }
}
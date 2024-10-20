package Lab2;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String name;
    private AnimalType animalType;
    private Owner owner;
    private List<Visit> visits;

    public Animal(String name, AnimalType animalType, Owner owner) {
        this.name = name;
        this.animalType = animalType;
        this.owner = owner;
        this.visits = new ArrayList<>();
    }

    public void addVisit(Visit visit) {
        visits.add(visit);
    }

    public List<Visit> getVisits() {
        return visits;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Animal Name: ").append(name)
                .append(", Animal Type: ").append(animalType)
                .append(", Owner: ").append(owner.toString())
                .append(", Number of Visits: ").append(visits.size())
                .append("\nVisits: \n");

        for (Visit visit : visits) {
            sb.append(visit.toString()).append("\n");
        }
        return sb.toString();
    }
}
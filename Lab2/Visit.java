package Lab2;

public class Visit {
    private String service;
    private double price;
    private Date visitDate;

    public Visit(String service, double price, Date visitDate) {
        this.service = service;
        this.price = price;
        this.visitDate = visitDate;
    }

    @Override
    public String toString() {
        return "Service: " + service + ", Price: " + price + ", Visit Date: " + visitDate.toString();
    }
}
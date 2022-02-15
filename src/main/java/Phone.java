import java.util.ArrayList;

public class Phone {
    private String make;
    private String model;
    private int memory;
    private Double price;
    //create this arraylist of strings, we will use it to validate the manufacturer
    ArrayList<String> validMakes = new ArrayList<>();

    public Phone(String make, String model, int memory, Double price) {
        this.make = make;
        this.model = model;
        this.memory = memory;
        this.price = price;
    }
}
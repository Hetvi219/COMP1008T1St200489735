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
    public void setModel(String model) {
        if(model.length() > 3)
            this.model = model;
        else throw new IllegalArgumentException("model needs to be longer");
    }
    public void setMemory(int memory) {
        if(memory >= 4 && memory <= 512)
            this.memory = memory;
        else{
            throw new IllegalArgumentException("memory value is invalid");
        }
    }
    public void setMake(String make) {
        validMakes.add("Apple");
        validMakes.add("HTC");
        validMakes.add("Samsung");
        validMakes.add("Google");
        validMakes.add("Moto");

        if(validMakes.contains(make)) this.make = make;
        else{
            throw new IllegalArgumentException("manufacturer invalid");
        }
    }
    public void setPrice(Double price) {
        if(price >= 0 && price <= 3000)
            this.price = price;
        else throw new IllegalArgumentException("price is invalid");
    }

    public Double getPrice() {
        return price;
    }
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", memory=" + memory +
                ", price=" + price +
                '}';
    }
}
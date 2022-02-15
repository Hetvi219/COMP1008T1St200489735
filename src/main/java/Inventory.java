import java.util.ArrayList;

public class Inventory{
    private ArrayList<Phone> phones;

    public Inventory() {
        phones = new ArrayList<>();
    }
    public void addPhone(Phone phone){
        phones.add(phone);
    }
    public int getNumOfPhones(){
        return phones.size();
    }
    public double getInventoryValue(){
        double inventoryValue = 0;
        for(Phone phone: phones){
            inventoryValue += phone.getPrice();
        }
        return inventoryValue;
    }
    public double getAvgPrice(){
        if(phones.size() == 0) return 0;

        double price = 0;
        for(Phone phone: phones){
            price += phone.getPrice();
        }
        return price / phones.size();
    }
    //bonus method
    public double getCheapestPhone(){
        if(phones.size() == 0) return 0;

        double price = phones.get(0).getPrice();
        for(Phone phone: phones){
            if(phone.getPrice() < price) price = phone.getPrice();
        }
        return price;
    }
}


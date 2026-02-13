package week03.invoice;

public class Invoice {
    String partNumber;
    String partDescription;
    int quantity;
    double price;


    public Invoice(String number, String description, int howMany, double howMuch) {
        partNumber = number;
        partDescription = description;
        quantity = howMany;
        price = howMuch;
    }


    public String getPartNumber() {
        return partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPartNumber(String number) {
        partNumber = number;
    }

    public void setPartDescription(String description) {
        partDescription = description;
    }

    public void setQuantity(int howMany) {
        quantity = howMany;
    }

    public void setPrice(double howMuch) {
        price = howMuch;
    }
}

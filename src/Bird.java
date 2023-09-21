public class Bird extends Animal implements Printable{

    private int quantity;

    public Bird(String name, String color, int quantity) {
        super(name, color);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nColor: " + getColor() +
                "\nQuantity: " + this.quantity);
    }
}

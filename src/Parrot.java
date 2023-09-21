public class Parrot extends Animal implements Printable {

    private String rary;

    public Parrot(String name, String color, String rary) {
        super(name, color);
        this.rary = rary;
    }

    public String getRary() {
        return rary;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nColor: " + getColor() +
                "\nRarity: " + this.rary);

    }
}


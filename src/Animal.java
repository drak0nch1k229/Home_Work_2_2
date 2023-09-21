public abstract class Animal implements  Printable{

    private String name;
    private String color;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

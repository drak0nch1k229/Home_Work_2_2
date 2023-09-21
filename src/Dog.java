public class Dog extends Animal implements Printable{

    private String command;

    public Dog(String name, String color, String command) {
        super(name, color);
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                "\nColor: " + getColor() +
                "\nCommand: " + this.command);
    }
}

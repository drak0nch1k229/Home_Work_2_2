
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        for (int i = 0; i < animals.length; i++) {
            System.out.println("--------------------------");
            animals[0] = creatObject("Bird");
            animals[1] = creatObject("Dog");
            animals[2] = creatObject("Parrot");
            animals[i].print();
        }
        }

        public static Animal creatObject(String clasName){
        Animal animal = null;
        if (clasName.equals("Bird")){
            animal=new Bird("Eagle", "Brown", 1);
        } else if (clasName.equals("Dog")) {
            animal=new Dog("Muhtar", "Black", "Sit down");
        } else if (clasName.equals("Parrot")) {
            animal=new Parrot("Blue Ara", "Blue", "Very Rarity");
        } else  {
            System.out.println(" ");
        }
        return animal;
        }

    }

package creational.prototype;

public class Main {

    public static void main(String[] args) {
        Human human = new Human("Haydar", 33, new Animal("fifo", "Dog"));
        System.out.println(human);

        Human human1 = (Human) human.createClone();
        human1.setName("Abbas");
        human1.setAnimal(new Animal("dody", "Cat"));
        System.out.println(human1);

        Human human2 = (Human) human.createClone();
        human2.setName("Ali");
        System.out.println(human2);
    }
}

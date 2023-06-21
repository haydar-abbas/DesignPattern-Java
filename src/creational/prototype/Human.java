package creational.prototype;

public class Human implements IPrototype{

    private String name;
    private int age;
    private Animal animal;

    public Human(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + animal +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public IPrototype createClone() {
        return new Human(name, age, animal);
    }
}

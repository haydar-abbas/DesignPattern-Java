package behavioural.observer;

public class Main {

    public static void main(String[] args) {
        Student haydar = new Student("Haydar");
        Student abbas = new Student("Abbas");
        Student ali = new Student("Ali");

        Course course = new Course("Math");
        course.add(haydar);
        course.add(abbas);
        course.add(ali);

        course.setAvailability(true);
        System.out.println("----------------");
        course.remove(ali);
        course.setAvailability(false);
    }
}

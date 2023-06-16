package behavioural.observer;

public class Main {

    public static void main(String[] args) {
        Student haydar = new Student("Haydar");
        Student abbas = new Student("Abbas");
        Student ali = new Student("Ali");

        Course course = new Course("Math");
        course.addObserver(haydar);
        course.addObserver(abbas);
        course.addObserver(ali);

        course.setStatus(true);
        System.out.println("----------------");
        course.removeObserver(ali);
        course.setStatus(false);
    }
}

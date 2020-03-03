package ua.lviv.logos.core.annotation;


public class Student extends Person {

    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void voice() {
        System.out.printf("I am student %s %s", getFirstName(), getLastName());
    }
}

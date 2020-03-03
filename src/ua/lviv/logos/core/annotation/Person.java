package ua.lviv.logos.core.annotation;

import ua.lviv.logos.core.annotation.annotations.JsonElement;
import ua.lviv.logos.core.annotation.annotations.JsonSerializable;

@JsonSerializable
public class Person {

    private int age;
    @JsonElement
    private String firstName;
    @JsonElement
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void voice() {
        System.out.println("Hello, My name is : " + firstName + " "
                + lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

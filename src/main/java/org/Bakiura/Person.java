package org.Bakiura;

public class Person {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final int gender;

    Person(String firstname, String lastname, int age, int gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }

    public void showPerson() {
        String gender = getGender();
        System.out.println(String.format("Firstname: %s\nLastname: %s\nAge: %d\nGender: %s", this.firstname, this.lastname, this.age, gender));
    }

    private String getGender() {
        if (this.gender == 0) {
            return "Kobieta";
        } else if (this.gender == 1) {
            return "Mężczyzna";
        } else {
            return "Nijaka";
        }
    }


}

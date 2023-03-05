package org.Bakiura;

public class Person {
    private final String firstname;
    private final String lastname;
    private final int age;
    private final int gender;
    private final float money;

    Person(String firstname, String lastname, int age, int gender, float money) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
        this.money = money;
    }

    public void showPerson() {
        String gender = getGender();
        System.out.println(String.format("Firstname: %s\nLastname: %s\nAge: %d\nGender: %s\nMoney: %.2f",
                this.firstname, this.lastname, this.age, gender, this.money));
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

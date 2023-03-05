package org.Bakiura;

public class Main {
    public static void main(String[] args) {
        System.out.println("That's my first application");
        System.out.println("Hello world!");

        Person person1 = new Person("Adam", "P", 12, 1, 1000.0F);
        person1.showPerson();

        Person person2 = new Person("Bartek", "P", 6, 1, 350.0F);
        person2.showPerson();
    }
}
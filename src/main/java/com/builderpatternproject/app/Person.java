package com.builderpatternproject.app;

import java.util.Objects;

/**
 * Person
 */
class Person {

    private final String name, surname;
    private String address;
    private int age;


    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age){
        this(name, surname);
        this.age = age;
    }

    public Person(String name, String surname, int age, String address){
        this(name, surname, age);
        this.address = address;
    }

    public void happyBirthday(){
        this.age++;
    }

    public boolean hasAge(){
        return this.age > 0? true : false;
    }

    public boolean hasAddress() {
        return this.address == null || this.address.length() < 1? false : true;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getAge() {
        return age;
    }
    public String getAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder(){
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address);
    }

    @Override
    public String toString(){
        return "[ "
                + " name: " + name
                + ", surname: " + surname
                + " ]";
    }

    @Override
    public int hashCode(){
        return Objects.hash(name, surname, age, address);
    }

}

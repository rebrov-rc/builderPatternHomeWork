package com.builderpatternproject.app;

/**
 * PersonBuilder
 */
class PersonBuilder {

    private  String name, surname, address;
    private int age;

    public PersonBuilder setName(String name){
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname){
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAddress(String address)throws IllegalArgumentException{
        if(address.length() < 1){
            throw new IllegalArgumentException("Указан пустой адрес!");
        }
        this.address = address;
        return this;
    }


    public PersonBuilder setAge(int age)throws IllegalArgumentException{
        if(age < 1){
            throw new IllegalArgumentException("Возраст должен быть больше нуля!");
        }
        this.age = age;
        return this;
    }

    public Person build()throws IllegalArgumentException{
        if(name == null || surname == null){
            throw new IllegalArgumentException("Напишите ваше полное имя!");
        }
        return new Person(
                this.name, this.surname,
                this.age, this.address
        );
    }

}
package com.builderpatternproject.app;


public class App{

    public void run(){

        try{

            var mom = new PersonBuilder()
                    .setName("Анна")
                    .setSurname("Вольф")
                    .setAge(31)
                    .setAddress("Сидней")
                    .build();

            var son = mom.newChildBuilder()
                    .setName("Макс")
                    .build();

            System.out.println("У " + mom + " есть сын, " + son);

        }catch(IllegalArgumentException ex){
            System.out.println(ex.toString());
        }

        try{
            new PersonBuilder().build();
        }catch(IllegalArgumentException ex){
            System.out.println(ex.toString());
        }


        try{
            new PersonBuilder().setAge(-10).build();
        }catch(IllegalArgumentException ex){
            System.out.println(ex.toString());
        }

    }
}
package com.zipcodewilmington.lambda2;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {


    public enum Sex{
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String email;


    public Person(String name, LocalDate birthday, Sex gender, String email) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Sex getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        return Period.between(birthday, now).getYears();
    }


    public  void  printPerson(){
        System.out.println(name+ " " + birthday + " " + gender + " " + email);
    }

    public static void printPersonList(List<Person> personList){
        for(Person p : personList){
            p.printPersonList(personList);
        }

    }
}

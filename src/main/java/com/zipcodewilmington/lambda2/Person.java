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

    public static void printPersonList(List<Person> personList,CheckPerson tester) {
        for (Person p : personList) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<Person> roster, int i, int j) {
        for (Person p : roster) {
            if (i <= p.getAge() && p.getAge() < j) {
                p.printPerson();
            }
        }
    }
}

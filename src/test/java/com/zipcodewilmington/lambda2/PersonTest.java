package com.zipcodewilmington.lambda2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {
    private LocalDate birthday;
    private LocalDate now = LocalDate.now();
    Person mo = new Person("mo", LocalDate.of(1975, 10, 01),
            Person.Sex.MALE,"mo@dawg.com");
    Person jack = new Person("jack", LocalDate.of(1977, 4, 12),
            Person.Sex.MALE,"jack@son.com");
    Person damon = new Person("damon", LocalDate.of(1971, 2, 9),
            Person.Sex.MALE,"d@bignig.com");
    Person jamie = new Person("jamie", LocalDate.of(1977, 5, 10),
            Person.Sex.MALE,"jcraz@gringoloco.com");
    Person colleen = new Person("colleen", LocalDate.of(1965, 6, 24),
            Person.Sex.MALE,"colcat@campbells.com");
    List<Person> crew;


    @Before
    public void setUp(){
        crew = new ArrayList<>();
        crew.add(mo);
        crew.add(jack);
        crew.add(damon);
        crew.add(jamie);
        crew.add(colleen);

    }
    @Test
    public void getAge() {
        //when
        Person mo = new Person("mo",LocalDate.of(1975, 10, 01),
                Person.Sex.MALE,"mo@dawg.com");
        //given
        int expected = 44;
        int actual = mo.getAge();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printPersonsOlderThan() {
        Person.printPersonsOlderThan(crew,50);
        Assert.assertTrue(colleen.getAge()>50);
        Assert.assertFalse(mo.getAge()>50);
    }


    @Test
    public void printPersonsWithinAgeRange() {
        Person.printPersonsWithinAgeRange(crew,40,50);
        Assert.assertTrue(jack.getAge()>40 && jack.getAge()<50);
        Assert.assertFalse(colleen.getAge()>40 && colleen.getAge()<50);
    }
}